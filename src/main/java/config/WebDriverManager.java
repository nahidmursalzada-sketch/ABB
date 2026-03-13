package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class WebDriverManager {

    private static WebDriver driver;
    private WebDriverManager(){}

    public static WebDriver getChromeDriver(){
        if (driver==null){
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--headless=new");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--disable-notifications");
            options.addArguments("--no-sandbox");
            driver=new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
