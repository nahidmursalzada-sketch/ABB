package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.KesbekPage;

public class KesbekStep {

    KesbekPage kesbekPage = new KesbekPage();

    @And("Istifadeci Kesbek alt menusuna klik edir")
    public void istifadeciKesbekAltMenusunaKlikEdir() {
        kesbekPage.navigateTo("/ferdi/kesbek");
    }

    @And("Istifadeci Faydali Kesbek linkine klik edir")
    public void istifadeciFaydaliKesbekLinkineKlikEdir() {
        kesbekPage.navigateTo("/ferdi/kesbek/faydali-kesbek");
    }

    @Then("Faydali Kesbek sehifesi acilir")
    public void faydaliKesbekSehifesiAcilir() {
        kesbekPage.waitForPageLoad();
    }

    @And("Istifadeci Fayda Max linkine klik edir")
    public void istifadeciFaydaMaxLinkineKlikEdir() {
        kesbekPage.navigateTo("/ferdi/kesbek/fayda-max");
    }

    @Then("Fayda Max sehifesi acilir")
    public void faydaMaxSehifesiAcilir() {
        kesbekPage.waitForPageLoad();
    }

    @And("Istifadeci Faydali Klub linkine klik edir")
    public void istifadeciFaydaliKlubLinkineKlikEdir() {
        kesbekPage.navigateTo("/ferdi/kesbek/faydali-klub");
    }

    @Then("Faydali Klub sehifesi acilir")
    public void faydaliKlubSehifesiAcilir() {
        kesbekPage.waitForPageLoad();
    }

    @And("Istifadeci Endirimler linkine klik edir")
    public void istifadeciEndirimlerLinkineKlikEdir() {
        kesbekPage.navigateTo("/ferdi/kesbek/discounts");
    }

    @Then("Endirimler sehifesi acilir")
    public void endirimlerSehifesiAcilir() {
        kesbekPage.waitForPageLoad();
    }

    @Then("Kesbek sehifesi acilir")
    public void kesbekSehifesiAcilir() {
        kesbekPage.waitForPageLoad();
    }

    @Then("Faydali Kesbek URL-i dogrudur")
    public void faydaliKesbekURLiDogrudur() {
        kesbekPage.verifyUrlContains("/ferdi/kesbek/faydali-kesbek");
    }

    @Then("Fayda Max URL-i dogrudur")
    public void faydaMaxURLiDogrudur() {
        kesbekPage.verifyUrlContains("/ferdi/kesbek/fayda-max");
    }

    @And("Istifadeci EN Faydali Kesbek sehifesine kecir")
    public void istifadeciENFaydaliKesbekSehifesineKecir() {
        kesbekPage.navigateTo("/en/personal/cashback/useful-cashback");
    }

    @Then("EN Faydali Kesbek sehifesi acilir")
    public void enFaydaliKesbekSehifesiAcilir() {
        kesbekPage.waitForPageLoad();
    }

    @Then("Faydali Klub URL-i dogrudur")
    public void faydaliKlubURLiDogrudur() {
        kesbekPage.verifyUrlContains("/ferdi/kesbek/faydali-klub");
    }

    @And("Istifadeci EN Fayda Max sehifesine kecir")
    public void istifadeciENFaydaMaxSehifesineKecir() {
        kesbekPage.navigateTo("/en/personal/cashback/benefit-max");
    }

    @Then("EN Fayda Max sehifesi acilir")
    public void enFaydaMaxSehifesiAcilir() {
        kesbekPage.waitForPageLoad();
    }
}
