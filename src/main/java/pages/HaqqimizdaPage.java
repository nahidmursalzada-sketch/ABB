package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HaqqimizdaPage extends BasePage {

    @FindBy(xpath = "//a[@href='/haqqimizda']")
    private WebElement haqqimizdaMenuButton;

    @FindBy(xpath = "//a[@href='/haqqimizda/rehberlik']")
    private WebElement rehberlikLink;

    @FindBy(xpath = "//a[contains(@href,'/idareetme-ve-komiteler')]")
    private WebElement idareetmeLink;

    @FindBy(xpath = "//a[@href='/haqqimizda/senedler']")
    private WebElement senedlerLink;

    @FindBy(xpath = "//a[@href='/haqqimizda/siyasetlerimiz']")
    private WebElement siyasetlerLink;

    @FindBy(xpath = "//a[contains(@href,'/korporativ-teqdimat')]")
    private WebElement korporativTeqdimatLink;

    @FindBy(xpath = "//a[contains(@href,'/haqqimizda/arasdirma')]")
    private WebElement arasdirmaLink;

    @FindBy(xpath = "//a[@href='/haqqimizda/hesabatlar']")
    private WebElement hesabatlarLink;

    @FindBy(xpath = "//a[contains(@href,'/teklif-ve-iradlar')]")
    private WebElement teklifVeIradlarLink;

    @FindBy(xpath = "//a[contains(@href,'/investisiya-bankciligi')]")
    private WebElement investisiyaBanckiliqiLink;

    @FindBy(xpath = "//a[contains(@href,'/brend-merkezi')]")
    private WebElement brendMerkeziLink;

    @FindBy(xpath = "//a[contains(@href,'/satinalmalar')]")
    private WebElement satinalmaLink;

    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverHaqqimizdaMenu() { hoverOverElement(haqqimizdaMenuButton); }
    public void clickRehberlik() { waitAndClick(rehberlikLink); }
    public void clickIdareetme() { waitAndClick(idareetmeLink); }
    public void clickSenedler() { waitAndClick(senedlerLink); }
    public void clickSiyasetler() { waitAndClick(siyasetlerLink); }
    public void clickKorporativTeqdimat() { waitAndClick(korporativTeqdimatLink); }
    public void clickArasdirma() { waitAndClick(arasdirmaLink); }
    public void clickHesabatlar() { waitAndClick(hesabatlarLink); }
    public void clickTeklifVeIradlar() { waitAndClick(teklifVeIradlarLink); }
    public void clickInvestisiyaBankciliqi() { waitAndClick(investisiyaBanckiliqiLink); }
    public void clickBrendMerkezi() { waitAndClick(brendMerkeziLink); }
    public void clickSatinalma() { waitAndClick(satinalmaLink); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
