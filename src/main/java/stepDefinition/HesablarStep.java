package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HesablarPage;

public class HesablarStep {

    HesablarPage hesablarPage = new HesablarPage();

    @And("Istifadeci Hesablar alt menusuna klik edir")
    public void istifadeciHesablarAltMenusunaKlikEdir() {
        hesablarPage.navigateTo("/ferdi/butun-hesablar");
    }

    @And("Istifadeci DigiHesab Max linkine klik edir")
    public void istifadeciDigiHesabMaxLinkineKlikEdir() {
        hesablarPage.navigateTo("/ferdi/butun-hesablar/digihesab-max");
    }

    @Then("DigiHesab Max sehifesi acilir")
    public void digiHesabMaxSehifesiAcilir() {
        hesablarPage.waitForPageLoad();
    }

    @And("Istifadeci DigiHesab linkine klik edir")
    public void istifadeciDigiHesabLinkineKlikEdir() {
        hesablarPage.navigateTo("/ferdi/butun-hesablar/digihesab");
    }

    @Then("DigiHesab sehifesi acilir")
    public void digiHesabSehifesiAcilir() {
        hesablarPage.waitForPageLoad();
    }

    @And("Istifadeci Cari hesab linkine klik edir")
    public void istifadeciCariHesabLinkineKlikEdir() {
        hesablarPage.navigateTo("/ferdi/butun-hesablar/cari-hesab");
    }

    @Then("Cari hesab sehifesi acilir")
    public void cariHesabSehifesiAcilir() {
        hesablarPage.waitForPageLoad();
    }

    @And("Istifadeci Dama-Dama linkine klik edir")
    public void istifadeciDamaDamaLinkineKlikEdir() {
        hesablarPage.navigateTo("/ferdi/butun-hesablar/dama-dama");
    }

    @Then("Dama-Dama sehifesi acilir")
    public void damaDamaSehifesiAcilir() {
        hesablarPage.waitForPageLoad();
    }

    @Then("Hesablar sehifesi acilir")
    public void hesablarSehifesiAcilir() {
        hesablarPage.waitForPageLoad();
    }

    @And("Istifadeci EN DigiHesab Max sehifesine kecir")
    public void istifadeciENDigiHesabMaxSehifesineKecir() {
        hesablarPage.navigateTo("/en/personal/accounts/digiaccount-max");
    }

    @Then("EN DigiHesab Max sehifesi acilir")
    public void enDigiHesabMaxSehifesiAcilir() {
        hesablarPage.waitForPageLoad();
    }

    @And("Istifadeci EN DigiHesab sehifesine kecir")
    public void istifadeciENDigiHesabSehifesineKecir() {
        hesablarPage.navigateTo("/en/personal/accounts/digiaccount");
    }

    @Then("EN DigiHesab sehifesi acilir")
    public void enDigiHesabSehifesiAcilir() {
        hesablarPage.waitForPageLoad();
    }

    @Then("DigiHesab Max URL-i dogrudur")
    public void digiHesabMaxURLiDogrudur() {
        hesablarPage.verifyUrlContains("/ferdi/butun-hesablar/digihesab-max");
    }

    @Then("Cari hesab URL-i dogrudur")
    public void cariHesabURLiDogrudur() {
        hesablarPage.verifyUrlContains("/ferdi/butun-hesablar/cari-hesab");
    }

    @Then("Dama-Dama URL-i dogrudur")
    public void damaDamaURLiDogrudur() {
        hesablarPage.verifyUrlContains("/ferdi/butun-hesablar/dama-dama");
    }

    @And("Istifadeci EN Cari hesab sehifesine kecir")
    public void istifadeciENCariHesabSehifesineKecir() {
        hesablarPage.navigateTo("/en/personal/accounts/current-account");
    }

    @Then("EN Cari hesab sehifesi acilir")
    public void enCariHesabSehifesiAcilir() {
        hesablarPage.waitForPageLoad();
    }

    @Then("DigiHesab URL-i dogrudur")
    public void digiHesabURLiDogrudur() {
        hesablarPage.verifyUrlContains("/ferdi/butun-hesablar/digihesab");
    }
}
