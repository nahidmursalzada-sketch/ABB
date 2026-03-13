package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HaqqimizdaPage;

public class HaqqimizdaStep {

    HaqqimizdaPage haqqimizdaPage = new HaqqimizdaPage();

    @And("Istifadeci Rehberlik linkine klik edir")
    public void istifadeciRehberlikLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/rehberlik");
    }

    @Then("Rehberlik sehifesi acilir")
    public void rehberlikSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Idareetme ve Komiteler linkine klik edir")
    public void istifadeciIdareetmeVeKomitelerLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/idareetme-ve-komiteler");
    }

    @Then("Idareetme sehifesi acilir")
    public void idareetmeSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Senedler linkine klik edir")
    public void istifadeciSenedlerLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/senedler");
    }

    @Then("Senedler sehifesi acilir")
    public void senedlerSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Hesabatlar linkine klik edir")
    public void istifadeciHesabatlarLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/hesabatlar");
    }

    @Then("Hesabatlar sehifesi acilir")
    public void hesabatlarSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Teklif ve Iradlar linkine klik edir")
    public void istifadeciTeklifVeIradlarLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/teklif-ve-iradlar");
    }

    @Then("Teklif ve Iradlar sehifesi acilir")
    public void teklifVeIradlarSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Siyasetlerimiz linkine klik edir")
    public void istifadeciSiyasetlerimizLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/siyasetlerimiz");
    }

    @Then("Siyasetlerimiz sehifesi acilir")
    public void siyasetlerimizSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Korporativ Teqdimat linkine klik edir")
    public void istifadeciKorporativTeqdimatLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/korporativ-teqdimat");
    }

    @Then("Korporativ Teqdimat sehifesi acilir")
    public void korporativTeqdimatSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Arasdirma linkine klik edir")
    public void istifadeciArasdirmaLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/arasdirma");
    }

    @Then("Arasdirma sehifesi acilir")
    public void arasdirmaSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Brend Merkezi linkine klik edir")
    public void istifadeciBrendMerkeziLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/brend-merkezi");
    }

    @Then("Brend Merkezi sehifesi acilir")
    public void brendMerkeziSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Satinalmalar linkine klik edir")
    public void istifadeciSatinalmaLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/satinalmalar");
    }

    @Then("Satinalmalar sehifesi acilir")
    public void satinalmalerSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci Investisiya Bankciliqi linkine klik edir")
    public void istifadeciInvestisiyaBankciliqiLinkineKlikEdir() {
        haqqimizdaPage.navigateTo("/haqqimizda/investisiya-bankciliqi");
    }

    @Then("Investisiya Bankciliqi sehifesi acilir")
    public void investisiyaBankciliqiSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @Then("Rehberlik URL-i dogrudur")
    public void rehberlikURLiDogrudur() {
        haqqimizdaPage.verifyUrlContains("/haqqimizda/rehberlik");
    }

    @Then("Hesabatlar URL-i dogrudur")
    public void hesabatlarURLiDogrudur() {
        haqqimizdaPage.verifyUrlContains("/haqqimizda/hesabatlar");
    }

    @And("Istifadeci EN Rehberlik sehifesine kecir")
    public void istifadeciENRehberlikSehifesineKecir() {
        haqqimizdaPage.navigateTo("/en/about-us/management");
    }

    @Then("EN Rehberlik sehifesi acilir")
    public void enRehberlikSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci EN Hesabatlar sehifesine kecir")
    public void istifadeciENHesabatlarSehifesineKecir() {
        haqqimizdaPage.navigateTo("/en/about-us/reports");
    }

    @Then("EN Hesabatlar sehifesi acilir")
    public void enHesabatlarSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @And("Istifadeci EN Senedler sehifesine kecir")
    public void istifadeciENSenedlerSehifesineKecir() {
        haqqimizdaPage.navigateTo("/en/about-us/documents");
    }

    @Then("EN Senedler sehifesi acilir")
    public void enSenedlerSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }

    @Then("Senedler URL-i dogrudur")
    public void senedlerURLiDogrudur() {
        haqqimizdaPage.verifyUrlContains("/haqqimizda/senedler");
    }

    @Then("Teklif ve Iradlar URL-i dogrudur")
    public void teklifVeIradlarURLiDogrudur() {
        haqqimizdaPage.verifyUrlContains("/haqqimizda/teklif-ve-iradlar");
    }

    @And("Istifadeci EN Idareetme sehifesine kecir")
    public void istifadeciENIdareetmeSehifesineKecir() {
        haqqimizdaPage.navigateTo("/en/about-us/governance-and-committees");
    }

    @Then("EN Idareetme sehifesi acilir")
    public void enIdareetmeSehifesiAcilir() {
        haqqimizdaPage.waitForPageLoad();
    }
}
