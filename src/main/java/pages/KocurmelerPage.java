package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KocurmelerPage extends BasePage {

    @FindBy(xpath = "//a[@href='/ferdi']")
    private WebElement ferdiMenuButton;

    @FindBy(xpath = "//a[@href='/ferdi/butun-emeliyyatlar']")
    private WebElement emeliyyatlarSubmenu;

    @FindBy(xpath = "//a[contains(@href,'/tecili-pul-kocurmeleri')]")
    private WebElement teciliPulKocurmeleriLink;

    @FindBy(xpath = "//a[@href='/ferdi/butun-emeliyyatlar/bank-kocurmeleri']")
    private WebElement bankKocurmeleriLink;

    @FindBy(xpath = "//a[contains(@href,'/digitransfer')]")
    private WebElement digiTransferLink;

    @FindBy(xpath = "//a[contains(@href,'/western-union')]")
    private WebElement westernUnionLink;

    @FindBy(xpath = "//a[contains(@href,'/granat')]")
    private WebElement granatLink;

    @FindBy(xpath = "//a[contains(@href,'/manat-express')]")
    private WebElement manatExpressLink;

    @FindBy(xpath = "//a[contains(@href,'/upt')]")
    private WebElement uptLink;

    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverFerdiMenu() { hoverOverElement(ferdiMenuButton); }
    public void clickEmeliyyatlarSubmenu() { waitAndClick(emeliyyatlarSubmenu); }
    public void clickTeciliPulKocurmeleri() { waitAndClick(teciliPulKocurmeleriLink); }
    public void clickBankKocurmeleri() { waitAndClick(bankKocurmeleriLink); }
    public void clickDigiTransfer() { waitAndClick(digiTransferLink); }
    public void clickWesternUnion() { waitAndClick(westernUnionLink); }
    public void clickGranat() { waitAndClick(granatLink); }
    public void clickManatExpress() { waitAndClick(manatExpressLink); }
    public void clickUpt() { waitAndClick(uptLink); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
