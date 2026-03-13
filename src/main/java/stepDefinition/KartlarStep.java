package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.KartlarPage;

public class KartlarStep {

    KartlarPage kartlarPage = new KartlarPage();

    @And("Istifadeci Kartlar alt menusuna klik edir")
    public void istifadeciKartlarAltMenusunaKlikEdir() {
        kartlarPage.navigateTo("/ferdi/kartlar");
    }

    @And("Istifadeci Kredit kartlari linkine klik edir")
    public void istifadeciKreditKartlariLinkineKlikEdir() {
        kartlarPage.navigateTo("/ferdi/kartlar/kredit-kartlari");
    }

    @Then("Kredit kartlari sehifesi acilir")
    public void kreditKartlariSehifesiAcilir() {
        kartlarPage.waitForPageLoad();
    }

    @And("Istifadeci Debet kartlari linkine klik edir")
    public void istifadeciDebetKartlariLinkineKlikEdir() {
        kartlarPage.navigateTo("/ferdi/kartlar/debet-kartlari");
    }

    @Then("Debet kartlari sehifesi acilir")
    public void debetKartlariSehifesiAcilir() {
        kartlarPage.waitForPageLoad();
    }

    @Then("Kartlar sehifesi acilir")
    public void kartlarSehifesiAcilir() {
        kartlarPage.waitForPageLoad();
    }

    @And("Istifadeci EN kredit kartlari sehifesine kecir")
    public void istifadeciENKreditKartlariSehifesineKecir() {
        kartlarPage.navigateTo("/en/personal/cards/credit-cards");
    }

    @Then("EN kredit kartlari sehifesi acilir")
    public void enKreditKartlariSehifesiAcilir() {
        kartlarPage.waitForPageLoad();
    }

    @And("Istifadeci EN debet kartlari sehifesine kecir")
    public void istifadeciENDebetKartlariSehifesineKecir() {
        kartlarPage.navigateTo("/en/personal/cards/debit-cards");
    }

    @Then("EN debet kartlari sehifesi acilir")
    public void enDebetKartlariSehifesiAcilir() {
        kartlarPage.waitForPageLoad();
    }

    @Then("Kredit kartlari URL-i dogrudur")
    public void kreditKartlariURLiDogrudur() {
        kartlarPage.verifyUrlContains("/ferdi/kartlar/kredit-kartlari");
    }

    @Then("Debet kartlari URL-i dogrudur")
    public void debetKartlariURLiDogrudur() {
        kartlarPage.verifyUrlContains("/ferdi/kartlar/debet-kartlari");
    }
}
