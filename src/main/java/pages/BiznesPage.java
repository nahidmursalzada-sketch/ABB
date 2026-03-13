package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BiznesPage extends BasePage {

    // Biznes menu
    @FindBy(xpath = "//a[@href='/biznes/korporativ']")
    private WebElement biznesMenuButton;

    // Korporativ
    @FindBy(xpath = "//a[@href='/biznes/korporativ']")
    private WebElement korporativLink;

    // Kicik ve orta biznes
    @FindBy(xpath = "//a[@href='/biznes/kicik-ve-orta-biznes']")
    private WebElement kobLink;

    // Mikro biznes
    @FindBy(xpath = "//a[@href='/biznes/mikro-biznes']")
    private WebElement mikroBiznesLink;

    // Korporativ kreditler
    @FindBy(xpath = "//a[contains(@href,'/korporativ-kreditler')]")
    private WebElement korporativKreditlerLink;

    // Odenis kartlari
    @FindBy(xpath = "//a[contains(@href,'/odenis-kartlari')]")
    private WebElement odenisKartlariLink;

    // Emekhaqi kartlari
    @FindBy(xpath = "//a[contains(text(),'Əməkhaqqı kartları') or contains(text(),'maaş')]")
    private WebElement emekhaqiKartlariLink;

    // KOB - Ani kredit
    @FindBy(xpath = "//a[contains(text(),'Ani kredit')]")
    private WebElement aniKreditLink;

    // KOB - Sahibkar krediti
    @FindBy(xpath = "//a[contains(text(),'Sahibkar')]")
    private WebElement sahibkarKreditiLink;

    // Internet bankciliq
    @FindBy(xpath = "//a[contains(@href,'cb.abb-bank.az')]")
    private WebElement internetBankciliqLink;

    // Sifaris edin
    @FindBy(xpath = "//a[contains(text(),'Sifariş edin')]")
    private WebElement sifarisEdinButton;

    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverBiznesMenu() { hoverOverElement(biznesMenuButton); }
    public void clickKorporativ() { waitAndClick(korporativLink); }
    public void clickKob() { waitAndClick(kobLink); }
    public void clickMikroBiznes() { waitAndClick(mikroBiznesLink); }
    public void clickKorporativKreditler() { waitAndClick(korporativKreditlerLink); }
    public void clickOdenisKartlari() { waitAndClick(odenisKartlariLink); }
    public void clickEmekhaqiKartlari() { waitAndClick(emekhaqiKartlariLink); }
    public void clickAniKredit() { waitAndClick(aniKreditLink); }
    public void clickSahibkarKrediti() { waitAndClick(sahibkarKreditiLink); }
    public void clickInternetBankciliq() { waitAndClick(internetBankciliqLink); }
    public void clickSifarisEdin() { waitAndClick(sifarisEdinButton); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
