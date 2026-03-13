package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlaynXidmetlerPage extends BasePage {

    @FindBy(xpath = "//a[@href='/ferdi']")
    private WebElement ferdiMenuButton;

    @FindBy(xpath = "//a[@href='/abb-mobile']")
    private WebElement abbMobileLink;

    @FindBy(xpath = "//a[@href='/ferdi/melumat-merkezi']")
    private WebElement melumatMerkeziLink;

    @FindBy(xpath = "//a[@href='/ferdi/arayis-sifarisi']")
    private WebElement arayisSifarisiLink;

    @FindBy(xpath = "//a[@href='/ferdi/kredit-odenisi']")
    private WebElement kreditOdenisiLink;

    @FindBy(xpath = "//a[@href='/ferdi/pul-kocurmesi']")
    private WebElement pulKocurmesiLink;

    @FindBy(xpath = "//a[@href='/ferdi/sigorta']")
    private WebElement sigortaLink;

    @FindBy(xpath = "//a[@href='/ferdi/investisiya']")
    private WebElement investisiyaLink;

    @FindBy(xpath = "//a[contains(@href,'randevu')]")
    private WebElement randevuLink;

    @FindBy(xpath = "//a[@href='/ferdi/karta-medaxil']")
    private WebElement kartaMedaxilLink;

    @FindBy(xpath = "//a[contains(@href,'/cash-by-code')]")
    private WebElement cashByCodeLink;

    @FindBy(xpath = "//a[contains(@href,'/pin-kod')]")
    private WebElement pinKodLink;

    @FindBy(xpath = "//a[contains(@href,'/iane-et')]")
    private WebElement ianeEtLink;

    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverFerdiMenu() { hoverOverElement(ferdiMenuButton); }
    public void clickAbbMobile() { waitAndClick(abbMobileLink); }
    public void clickMelumatMerkezi() { waitAndClick(melumatMerkeziLink); }
    public void clickArayisSifarisi() { waitAndClick(arayisSifarisiLink); }
    public void clickKreditOdenisi() { waitAndClick(kreditOdenisiLink); }
    public void clickKartaMedaxil() { waitAndClick(kartaMedaxilLink); }
    public void clickPulKocurmesi() { waitAndClick(pulKocurmesiLink); }
    public void clickCashByCode() { waitAndClick(cashByCodeLink); }
    public void clickIaneEt() { waitAndClick(ianeEtLink); }
    public void clickPinKod() { waitAndClick(pinKodLink); }
    public void clickSigorta() { waitAndClick(sigortaLink); }
    public void clickInvestisiya() { waitAndClick(investisiyaLink); }
    public void clickRandevu() { waitAndClick(randevuLink); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
