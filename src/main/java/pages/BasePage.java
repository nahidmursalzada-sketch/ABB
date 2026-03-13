package pages;

import config.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BasePage {
    public WebDriver driver;
    public JavascriptExecutor js;
    private String mainWindowHandle;

    public BasePage() {
        this.driver = WebDriverManager.getChromeDriver();
        this.js = (JavascriptExecutor) driver;
        this.mainWindowHandle = driver.getWindowHandle();
        PageFactory.initElements(driver, this);
    }

    public void waitAndSendKeys(WebElement element, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
            element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            element.sendKeys(Keys.BACK_SPACE);
            element.sendKeys(text);
        } catch (RuntimeException e) {
            System.out.println("Element tapilmadi ve ya doldurula bilmedi: " + e.getMessage());
            throw e;
        }
    }

    public void fillFieldAndEnter(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
        element.sendKeys(Keys.RETURN);
    }

    public void waitAndClick(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element));
            } catch (TimeoutException te) {
                // Element gorunmur amma DOM-da ola biler - JS click ile calisaq
                js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
                js.executeScript("arguments[0].click();", element);
                return;
            }
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
            try {
                element.click();
            } catch (ElementClickInterceptedException ex) {
                js.executeScript("arguments[0].click();", element);
            }
        } catch (RuntimeException e) {
            System.out.println("Element not found/clickable: " + e.getMessage());
            throw e;
        }
    }

    public void hoverOverElement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            try {
                wait.until(ExpectedConditions.visibilityOf(element));
            } catch (TimeoutException te) {
                js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
            }
            try {
                Actions actions = new Actions(driver);
                actions.moveToElement(element).perform();
            } catch (Exception actionEx) {
                // Headless modda Actions ishlemir - JS mouseover event gonderirik
                js.executeScript(
                    "var event = new MouseEvent('mouseover', {bubbles: true, cancelable: true});" +
                    "arguments[0].dispatchEvent(event);", element);
            }
        } catch (Exception e) {
            System.out.println("Elementin uzerine hover edile bilmedi: " + e.getMessage());
            throw e;
        }
    }

    public void waitUntilAtLeastOne(By itemsLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> driver.findElements(itemsLocator).size() > 0);
    }

    public void scrollToElement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(element));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
        } catch (Exception e) {
            throw e;
        }
    }

    public void switchToNewTab() {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                return;
            }
        }
        throw new RuntimeException("Yeni sekme tapilmadi!");
    }

    public void switchToOriginalTab() {
        driver.switchTo().window(mainWindowHandle);
    }

    public void closeNewTabAndReturn() {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                driver.close();
                driver.switchTo().window(mainWindowHandle);
                return;
            }
        }
        throw new RuntimeException("Yeni sekme tapilmadi!");
    }

    public void scrollToBottom() {
        js.executeScript("window.scrollTo(20, document.body.scrollHeight);");
    }

    public void waitForPageLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete"));
    }

    public void navigateTo(String path) {
        driver.get("https://abb-bank.az" + path);
        waitForPageLoad();
    }

    public void verifyUrlContains(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                webDriver -> webDriver.getCurrentUrl().contains(text));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void closeBrowser() {
        WebDriverManager.quitDriver();
    }

    public void switchToNewTabAndCloseOriginal() {
        String originalHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();

        if (allHandles.size() > 1) {
            for (String handle : allHandles) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    driver.switchTo().window(originalHandle).close();
                    driver.switchTo().window(handle);
                    break;
                }
            }
        } else {
            System.out.println("Yeni tab tapilmadi!");
        }
    }

    public String waitAndGetText(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.getText();
        } catch (RuntimeException e) {
            System.out.println("Element not found or not visible: " + e.getMessage());
            return null;
        }
    }
}
