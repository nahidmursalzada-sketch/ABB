package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.EmanetlerPage;

public class EmanetlerStep {

    EmanetlerPage emanetlerPage = new EmanetlerPage();

    @And("Istifadeci Emanetler alt menusuna klik edir")
    public void istifadeciEmanetlerAltMenusunaKlikEdir() {
        emanetlerPage.navigateTo("/ferdi/emanetler");
    }

    @And("Istifadeci DigiDeposit linkine klik edir")
    public void istifadeciDigiDepositLinkineKlikEdir() {
        emanetlerPage.navigateTo("/ferdi/emanetler/digideposit");
    }

    @Then("DigiDeposit sehifesi acilir")
    public void digiDepositSehifesiAcilir() {
        emanetlerPage.waitForPageLoad();
    }

    @And("Istifadeci Klassik emanet linkine klik edir")
    public void istifadeciKlassikEmanetLinkineKlikEdir() {
        emanetlerPage.navigateTo("/ferdi/emanetler/klassik-emaneti");
    }

    @Then("Klassik emanet sehifesi acilir")
    public void klassikEmanetSehifesiAcilir() {
        emanetlerPage.waitForPageLoad();
    }

    @And("Istifadeci Depozit seyfi linkine klik edir")
    public void istifadeciDepozitSeyfiLinkineKlikEdir() {
        emanetlerPage.navigateTo("/ferdi/emanetler/depozit-seyfi");
    }

    @Then("Depozit seyfi sehifesi acilir")
    public void depozitSeyfiSehifesiAcilir() {
        emanetlerPage.waitForPageLoad();
    }

    @And("Istifadeci Emanetli ipoteka krediti linkine klik edir")
    public void istifadeciEmanetliIpotekaKreditiLinkineKlikEdir() {
        emanetlerPage.navigateTo("/ferdi/emanetler/emanetli-ipoteka-krediti");
    }

    @Then("Emanetli ipoteka krediti sehifesi acilir")
    public void emanetliIpotekaKreditiSehifesiAcilir() {
        emanetlerPage.waitForPageLoad();
    }

    @Then("Emanetler sehifesi acilir")
    public void emanetlerSehifesiAcilir() {
        emanetlerPage.waitForPageLoad();
    }

    @And("Istifadeci EN DigiDeposit sehifesine kecir")
    public void istifadeciENDigiDepositSehifesineKecir() {
        emanetlerPage.navigateTo("/en/personal/deposits/digideposit");
    }

    @Then("EN DigiDeposit sehifesi acilir")
    public void enDigiDepositSehifesiAcilir() {
        emanetlerPage.waitForPageLoad();
    }

    @And("Istifadeci EN klassik emanet sehifesine kecir")
    public void istifadeciENKlassikEmanetSehifesineKecir() {
        emanetlerPage.navigateTo("/en/personal/deposits/classic-deposit");
    }

    @Then("EN klassik emanet sehifesi acilir")
    public void enKlassikEmanetSehifesiAcilir() {
        emanetlerPage.waitForPageLoad();
    }

    @Then("DigiDeposit URL-i dogrudur")
    public void digiDepositURLiDogrudur() {
        emanetlerPage.verifyUrlContains("/ferdi/emanetler/digideposit");
    }

    @Then("Klassik emanet URL-i dogrudur")
    public void klassikEmanetURLiDogrudur() {
        emanetlerPage.verifyUrlContains("/ferdi/emanetler/klassik-emaneti");
    }

    @Then("Depozit seyfi URL-i dogrudur")
    public void depozitSeyfiURLiDogrudur() {
        emanetlerPage.verifyUrlContains("/ferdi/emanetler/depozit-seyfi");
    }
}
