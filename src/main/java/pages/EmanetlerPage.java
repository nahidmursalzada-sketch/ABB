package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmanetlerPage extends BasePage {

    @FindBy(xpath = "//a[@href='/ferdi']")
    private WebElement ferdiMenuButton;

    @FindBy(xpath = "//a[@href='/ferdi/emanetler']")
    private WebElement emanetlerSubmenu;

    @FindBy(xpath = "//a[@href='/ferdi/emanetler/digideposit']")
    private WebElement digiDepositLink;

    @FindBy(xpath = "//a[@href='/ferdi/emanetler/klassik-emaneti']")
    private WebElement klassikEmanetLink;

    @FindBy(xpath = "//a[@href='/ferdi/emanetler/depozit-seyfi']")
    private WebElement depozitSeyfiLink;

    @FindBy(xpath = "//a[@href='/ferdi/emanetler/emanetli-ipoteka-krediti']")
    private WebElement emanetliIpotekaLink;

    @FindBy(xpath = "//h1")
    private WebElement pageTitle;

    public void hoverFerdiMenu() { hoverOverElement(ferdiMenuButton); }
    public void clickEmanetlerSubmenu() { waitAndClick(emanetlerSubmenu); }
    public void clickDigiDeposit() { waitAndClick(digiDepositLink); }
    public void clickKlassikEmanet() { waitAndClick(klassikEmanetLink); }
    public void clickDepozitSeyfi() { waitAndClick(depozitSeyfiLink); }
    public void clickEmanetliIpoteka() { waitAndClick(emanetliIpotekaLink); }
    public String getPageTitle() { return waitAndGetText(pageTitle); }
}
