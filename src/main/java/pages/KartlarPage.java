package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KartlarPage extends BasePage {

    // Ferdi menu
    @FindBy(xpath = "//a[@href='/ferdi']")
    private WebElement ferdiMenuButton;

    // Kartlar submenu
    @FindBy(xpath = "//a[@href='/ferdi/kartlar']")
    private WebElement kartlarSubmenu;

    // Kredit kartlari
    @FindBy(xpath = "//a[@href='/ferdi/kartlar/kredit-kartlari']")
    private WebElement kreditKartlariLink;

    // Debet kartlari
    @FindBy(xpath = "//a[@href='/ferdi/kartlar/debet-kartlari']")
    private WebElement debetKartlariLink;

    // Sifaris edin button
    @FindBy(xpath = "//a[contains(text(),'Sifariş edin') or contains(text(),'Müraciət')]")
    private WebElement sifarisEdinButton;

    // Sehife basligi
    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverFerdiMenu() { hoverOverElement(ferdiMenuButton); }
    public void clickKartlarSubmenu() { waitAndClick(kartlarSubmenu); }
    public void clickKreditKartlari() { waitAndClick(kreditKartlariLink); }
    public void clickDebetKartlari() { waitAndClick(debetKartlariLink); }
    public void clickSifarisEdin() { waitAndClick(sifarisEdinButton); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
