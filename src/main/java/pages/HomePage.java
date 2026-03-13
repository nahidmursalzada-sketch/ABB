package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    // Ferdi menu
    @FindBy(xpath = "//a[@href='/ferdi']")
    private WebElement ferdiMenuButton;

    // Biznes menu
    @FindBy(xpath = "//a[@href='/biznes/korporativ']")
    private WebElement biznesMenuButton;

    // Haqqimizda menu
    @FindBy(xpath = "//a[@href='/haqqimizda']")
    private WebElement haqqimizdaMenuButton;

    // Investorlarla elaqe
    @FindBy(xpath = "//a[@href='/investorlarla-elaqe']")
    private WebElement investorlarMenuButton;

    // Dil secimi - AZ button (dropdown trigger)
    @FindBy(xpath = "//button[contains(text(),'AZ')]")
    private WebElement languageButton;

    // Banner slider - next button (ilk tapilan)
    @FindBy(xpath = "(//button[normalize-space()='Next slide'])[1]")
    private WebElement bannerNextButton;

    // Banner slider - prev button (ilk tapilan)
    @FindBy(xpath = "(//button[normalize-space()='Previous slide'])[1]")
    private WebElement bannerPrevButton;

    // Valyuta mezenneleri linki
    @FindBy(xpath = "//a[contains(@href,'/ferdi/valyuta-mezenneleri')]")
    private WebElement valyutaLink;

    // Filiallar linki
    @FindBy(xpath = "//a[contains(@href,'/filiallar')]")
    private WebElement filiallarLink;

    // 937 hotline
    @FindBy(xpath = "//a[@href='tel:937']")
    private WebElement hotlineLink;

    // Kredit limiti - Mobil nomre
    @FindBy(xpath = "//input[@placeholder='Mobil nömrə']")
    private WebElement kreditMobilInput;

    // Kredit limiti - FIN kod
    @FindBy(xpath = "//input[@placeholder='FİN kod']")
    private WebElement kreditFinInput;

    // Davam et buttonu
    @FindBy(xpath = "//button[contains(text(),'Davam et')]")
    private WebElement davamEtButton;

    public void clickFerdiMenu() { waitAndClick(ferdiMenuButton); }
    public void hoverFerdiMenu() { hoverOverElement(ferdiMenuButton); }
    public void clickBiznesMenu() { waitAndClick(biznesMenuButton); }
    public void hoverBiznesMenu() { hoverOverElement(biznesMenuButton); }
    public void clickHaqqimizdaMenu() { waitAndClick(haqqimizdaMenuButton); }
    public void hoverHaqqimizdaMenu() { hoverOverElement(haqqimizdaMenuButton); }
    public void clickInvestorlarMenu() { waitAndClick(investorlarMenuButton); }
    public void clickLanguageButton() { waitAndClick(languageButton); }
    public void clickBannerNext() { waitAndClick(bannerNextButton); }
    public void clickBannerPrev() { waitAndClick(bannerPrevButton); }
    public void clickFiliallar() { waitAndClick(filiallarLink); }
    public void clickHotline() { waitAndClick(hotlineLink); }
    public void clickValyuta() { waitAndClick(valyutaLink); }
    public void enterMobilNomre(String nomre) { waitAndSendKeys(kreditMobilInput, nomre); }
    public void enterFinKod(String fin) { waitAndSendKeys(kreditFinInput, fin); }
    public void clickDavamEt() { waitAndClick(davamEtButton); }
}
