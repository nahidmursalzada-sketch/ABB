import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import java.util.*;

public class FindElements {
    public static void main(String[] args) throws Exception {
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--headless=new","--disable-gpu","--window-size=1920,1080","--no-sandbox");
        WebDriver d = new ChromeDriver(o);
        d.get("https://abb-bank.az/az");
        Thread.sleep(5000);

        System.out.println("=== BUTTONS ===");
        List<WebElement> buttons = d.findElements(By.tagName("button"));
        for(WebElement b : buttons) {
            String text = b.getText().trim().replace("\n"," ");
            String aria = b.getAttribute("aria-label");
            String cls = b.getAttribute("class");
            if(text.length()>0 || (aria!=null && aria.length()>0))
                System.out.println("BTN: text=["+text+"] aria=["+aria+"] class=["+cls+"]");
        }

        System.out.println("\n=== FERDI LINKS ===");
        List<WebElement> ferdiLinks = d.findElements(By.xpath("//a[@href='/ferdi']"));
        for(int i=0; i<ferdiLinks.size(); i++) {
            WebElement f = ferdiLinks.get(i);
            System.out.println("FERDI["+i+"]: displayed="+f.isDisplayed()+" size="+f.getSize()+" tag="+f.getTagName()+" class=["+f.getAttribute("class")+"]");
        }
        // Also check nav structure
        List<WebElement> navLinks = d.findElements(By.cssSelector("nav a"));
        System.out.println("\n=== NAV LINKS (first 20) ===");
        int count = 0;
        for(WebElement nl : navLinks) {
            if(count++ >= 20) break;
            String href = nl.getAttribute("href");
            boolean vis = false;
            try { vis = nl.isDisplayed(); } catch(Exception ex) {}
            System.out.println("NAV: href=["+href+"] text=["+nl.getText().trim()+"] displayed="+vis);
        }

        System.out.println("\n=== LANG LINKS ===");
        List<WebElement> links = d.findElements(By.tagName("a"));
        for(WebElement a : links) {
            String href = a.getAttribute("href");
            String text = a.getText().trim();
            if(href!=null && (href.contains("/en") || text.equals("EN") || text.equals("AZ")))
                System.out.println("LANG: text=["+text+"] href=["+href+"]");
        }

        System.out.println("\n=== FILIALLAR ===");
        for(WebElement a : links) {
            String href = a.getAttribute("href");
            if(href!=null && href.contains("filial"))
                System.out.println("FIL: text=["+a.getText().trim()+"] href=["+href+"]");
        }

        d.quit();
    }
}
