package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KreditlerPage extends BasePage {

    // Ferdi menu
    @FindBy(xpath = "//a[@href='/ferdi']")
    private WebElement ferdiMenuButton;

    // Kreditler submenu
    @FindBy(xpath = "//a[@href='/ferdi/kreditler']")
    private WebElement kreditlerSubmenu;

    // Nagd kredit
    @FindBy(xpath = "//a[@href='/ferdi/kreditler/nagd-kredit']")
    private WebElement nagdKreditLink;

    // Avans kredit
    @FindBy(xpath = "//a[@href='/ferdi/kreditler/avans-kredit-xetti']")
    private WebElement avansKreditLink;

    // Indi al sonra ode
    @FindBy(xpath = "//a[@href='/ferdi/kreditler/indi-al-sonra-ode']")
    private WebElement indiAlSonraOdeLink;

    // Avtomobil krediti
    @FindBy(xpath = "//a[@href='/ferdi/kreditler/avtomobil-krediti']")
    private WebElement avtomobilKreditiLink;

    // Emanetci nagd krediti
    @FindBy(xpath = "//a[@href='/ferdi/kreditler/emanetci-nagd-krediti']")
    private WebElement emanetciNagdKreditiLink;

    // Emanetci kredit limiti
    @FindBy(xpath = "//a[@href='/ferdi/kreditler/emanetci-kredit-limiti']")
    private WebElement emanetciKreditLimitiLink;

    // Ipoteka krediti
    @FindBy(xpath = "//a[@href='/ferdi/kreditler/ipoteka-krediti']")
    private WebElement ipotekaKreditiLink;

    // Sifaris edin button
    @FindBy(xpath = "//a[contains(text(),'Sifariş edin') or contains(text(),'Müraciət edin')]")
    private WebElement sifarisEdinButton;

    // Sehife basligi
    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverFerdiMenu() { hoverOverElement(ferdiMenuButton); }
    public void clickKreditlerSubmenu() { waitAndClick(kreditlerSubmenu); }
    public void clickNagdKredit() { waitAndClick(nagdKreditLink); }
    public void clickAvansKredit() { waitAndClick(avansKreditLink); }
    public void clickIndiAlSonraOde() { waitAndClick(indiAlSonraOdeLink); }
    public void clickAvtomobilKrediti() { waitAndClick(avtomobilKreditiLink); }
    public void clickEmanetciNagdKrediti() { waitAndClick(emanetciNagdKreditiLink); }
    public void clickEmanetciKreditLimiti() { waitAndClick(emanetciKreditLimitiLink); }
    public void clickIpotekaKrediti() { waitAndClick(ipotekaKreditiLink); }
    public void clickSifarisEdin() { waitAndClick(sifarisEdinButton); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
