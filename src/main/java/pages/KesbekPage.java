package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KesbekPage extends BasePage {

    @FindBy(xpath = "//a[@href='/ferdi']")
    private WebElement ferdiMenuButton;

    @FindBy(xpath = "//a[@href='/ferdi/kesbek']")
    private WebElement kesbekSubmenu;

    @FindBy(xpath = "//a[@href='/ferdi/kesbek/faydali-kesbek']")
    private WebElement faydaliKesbekLink;

    @FindBy(xpath = "//a[@href='/ferdi/kesbek/fayda-max']")
    private WebElement faydaMaxLink;

    @FindBy(xpath = "//a[@href='/ferdi/kesbek/faydali-klub']")
    private WebElement faydaliKlubLink;

    @FindBy(xpath = "//a[@href='/ferdi/kesbek/discounts']")
    private WebElement endirimlerLink;

    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverFerdiMenu() { hoverOverElement(ferdiMenuButton); }
    public void clickKesbekSubmenu() { waitAndClick(kesbekSubmenu); }
    public void clickFaydaliKesbek() { waitAndClick(faydaliKesbekLink); }
    public void clickFaydaMax() { waitAndClick(faydaMaxLink); }
    public void clickFaydaliKlub() { waitAndClick(faydaliKlubLink); }
    public void clickEndirimler() { waitAndClick(endirimlerLink); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
