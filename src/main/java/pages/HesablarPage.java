package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HesablarPage extends BasePage {

    @FindBy(xpath = "//a[@href='/ferdi']")
    private WebElement ferdiMenuButton;

    @FindBy(xpath = "//a[@href='/ferdi/butun-hesablar']")
    private WebElement hesablarSubmenu;

    @FindBy(xpath = "//a[@href='/ferdi/butun-hesablar/digihesab-max']")
    private WebElement digiHesabMaxLink;

    @FindBy(xpath = "//a[@href='/ferdi/butun-hesablar/digihesab']")
    private WebElement digiHesabLink;

    @FindBy(xpath = "//a[@href='/ferdi/butun-hesablar/cari-hesab']")
    private WebElement cariHesabLink;

    @FindBy(xpath = "//a[@href='/ferdi/butun-hesablar/dama-dama']")
    private WebElement damaDamaLink;

    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverFerdiMenu() { hoverOverElement(ferdiMenuButton); }
    public void clickHesablarSubmenu() { waitAndClick(hesablarSubmenu); }
    public void clickDigiHesabMax() { waitAndClick(digiHesabMaxLink); }
    public void clickDigiHesab() { waitAndClick(digiHesabLink); }
    public void clickCariHesab() { waitAndClick(cariHesabLink); }
    public void clickDamaDama() { waitAndClick(damaDamaLink); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
