package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.KocurmelerPage;

public class KocurmelerStep {

    KocurmelerPage kocurmelerPage = new KocurmelerPage();

    @And("Istifadeci Emeliyyatlar alt menusuna klik edir")
    public void istifadeciEmeliyyatlarAltMenusunaKlikEdir() {
        kocurmelerPage.navigateTo("/ferdi/butun-emeliyyatlar");
    }

    @And("Istifadeci Tecili pul kocurmeleri linkine klik edir")
    public void istifadeciTeciliPulKocurmeleriLinkineKlikEdir() {
        kocurmelerPage.navigateTo("/ferdi/butun-emeliyyatlar/tecili-pul-kocurmeleri");
    }

    @Then("Tecili pul kocurmeleri sehifesi acilir")
    public void teciliPulKocurmeleriSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @And("Istifadeci Bank kocurmeleri linkine klik edir")
    public void istifadeciBankKocurmeleriLinkineKlikEdir() {
        kocurmelerPage.navigateTo("/ferdi/butun-emeliyyatlar/bank-kocurmeleri");
    }

    @Then("Bank kocurmeleri sehifesi acilir")
    public void bankKocurmeleriSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @And("Istifadeci DigiTransfer linkine klik edir")
    public void istifadeciDigiTransferLinkineKlikEdir() {
        kocurmelerPage.navigateTo("/ferdi/butun-emeliyyatlar/digitransfer-pul-kocurme");
    }

    @Then("DigiTransfer sehifesi acilir")
    public void digiTransferSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @And("Istifadeci Western Union linkine klik edir")
    public void istifadeciWesternUnionLinkineKlikEdir() {
        kocurmelerPage.navigateTo("/ferdi/butun-emeliyyatlar/western-union");
    }

    @Then("Western Union sehifesi acilir")
    public void westernUnionSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @And("Istifadeci Granat linkine klik edir")
    public void istifadeciGranatLinkineKlikEdir() {
        kocurmelerPage.navigateTo("/ferdi/butun-emeliyyatlar/granat");
    }

    @Then("Granat sehifesi acilir")
    public void granatSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @And("Istifadeci Manat Express linkine klik edir")
    public void istifadeciManatExpressLinkineKlikEdir() {
        kocurmelerPage.navigateTo("/ferdi/butun-emeliyyatlar/manat-express");
    }

    @Then("Manat Express sehifesi acilir")
    public void manatExpressSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @And("Istifadeci UPT linkine klik edir")
    public void istifadeciUPTLinkineKlikEdir() {
        kocurmelerPage.navigateTo("/ferdi/butun-emeliyyatlar/upt");
    }

    @Then("UPT sehifesi acilir")
    public void uptSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @Then("Emeliyyatlar sehifesi acilir")
    public void emeliyyatlarSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @Then("Tecili pul kocurmeleri URL-i dogrudur")
    public void teciliPulKocurmeleriURLiDogrudur() {
        kocurmelerPage.verifyUrlContains("/ferdi/butun-emeliyyatlar/tecili-pul-kocurmeleri");
    }

    @Then("Bank kocurmeleri URL-i dogrudur")
    public void bankKocurmeleriURLiDogrudur() {
        kocurmelerPage.verifyUrlContains("/ferdi/butun-emeliyyatlar/bank-kocurmeleri");
    }

    @And("Istifadeci EN tecili pul kocurmeleri sehifesine kecir")
    public void istifadeciENTeciliPulKocurmeleriSehifesineKecir() {
        kocurmelerPage.navigateTo("/en/personal/all-transactions/urgent-money-transfers");
    }

    @Then("EN tecili pul kocurmeleri sehifesi acilir")
    public void enTeciliPulKocurmeleriSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @And("Istifadeci EN bank kocurmeleri sehifesine kecir")
    public void istifadeciENBankKocurmeleriSehifesineKecir() {
        kocurmelerPage.navigateTo("/en/personal/all-transactions/bank-transfers");
    }

    @Then("EN bank kocurmeleri sehifesi acilir")
    public void enBankKocurmeleriSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }

    @Then("DigiTransfer URL-i dogrudur")
    public void digiTransferURLiDogrudur() {
        kocurmelerPage.verifyUrlContains("/ferdi/butun-emeliyyatlar/digitransfer-pul-kocurme");
    }

    @Then("Western Union URL-i dogrudur")
    public void westernUnionURLiDogrudur() {
        kocurmelerPage.verifyUrlContains("/ferdi/butun-emeliyyatlar/western-union");
    }

    @And("Istifadeci EN emeliyyatlar sehifesine kecir")
    public void istifadeciENEmeliyyatlarSehifesineKecir() {
        kocurmelerPage.navigateTo("/en/personal/all-transactions");
    }

    @Then("EN emeliyyatlar sehifesi acilir")
    public void enEmeliyyatlarSehifesiAcilir() {
        kocurmelerPage.waitForPageLoad();
    }
}
