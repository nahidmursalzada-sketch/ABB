package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OnlaynXidmetlerPage;

public class OnlaynXidmetlerStep {

    OnlaynXidmetlerPage onlaynPage = new OnlaynXidmetlerPage();

    @And("Istifadeci ABB Mobile linkine klik edir")
    public void istifadeciABBMobileLinkineKlikEdir() {
        onlaynPage.navigateTo("/abb-mobile");
    }

    @Then("ABB Mobile sehifesi acilir")
    public void abbMobileSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Melumat Merkezi linkine klik edir")
    public void istifadeciMelumatMerkeziLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/melumat-merkezi");
    }

    @Then("Melumat Merkezi sehifesi acilir")
    public void melumatMerkeziSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Kredit Odenisi linkine klik edir")
    public void istifadeciKreditOdenisiLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/kredit-odenisi");
    }

    @Then("Kredit Odenisi sehifesi acilir")
    public void kreditOdenisiSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Karta Medaxil linkine klik edir")
    public void istifadeciKartaMedaxilLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/karta-medaxil");
    }

    @Then("Karta Medaxil sehifesi acilir")
    public void kartaMedaxilSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Cash by Code linkine klik edir")
    public void istifadeciCashByCodeLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/cash-by-code");
    }

    @Then("Cash by Code sehifesi acilir")
    public void cashByCodeSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Sigorta linkine klik edir")
    public void istifadeciSigortaLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/sigorta");
    }

    @Then("Sigorta sehifesi acilir")
    public void sigortaSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Investisiya linkine klik edir")
    public void istifadeciInvestisiyaLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/investisiya");
    }

    @Then("Investisiya sehifesi acilir")
    public void investisiyaSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Arayis Sifarisi linkine klik edir")
    public void istifadeciArayisSifarisiLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/arayis-sifarisi");
    }

    @Then("Arayis Sifarisi sehifesi acilir")
    public void arayisSifarisiSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Pul Kocurmesi linkine klik edir")
    public void istifadeciPulKocurmesiLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/pul-kocurmesi");
    }

    @Then("Pul Kocurmesi sehifesi acilir")
    public void pulKocurmesiSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci PIN kod linkine klik edir")
    public void istifadeciPINKodLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/pin-kod");
    }

    @Then("PIN kod sehifesi acilir")
    public void pinKodSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci Iane et linkine klik edir")
    public void istifadeciIaneEtLinkineKlikEdir() {
        onlaynPage.navigateTo("/ferdi/iane-et");
    }

    @Then("Iane et sehifesi acilir")
    public void ianeEtSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci EN ABB Mobile sehifesine kecir")
    public void istifadeciENABBMobileSehifesineKecir() {
        onlaynPage.navigateTo("/en/abb-mobile");
    }

    @Then("EN ABB Mobile sehifesi acilir")
    public void enABBMobileSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @And("Istifadeci EN Sigorta sehifesine kecir")
    public void istifadeciENSigortaSehifesineKecir() {
        onlaynPage.navigateTo("/en/personal/insurance");
    }

    @Then("EN Sigorta sehifesi acilir")
    public void enSigortaSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }

    @Then("ABB Mobile URL-i dogrudur")
    public void abbMobileURLiDogrudur() {
        onlaynPage.verifyUrlContains("/abb-mobile");
    }

    @Then("Kredit Odenisi URL-i dogrudur")
    public void kreditOdenisiURLiDogrudur() {
        onlaynPage.verifyUrlContains("/ferdi/kredit-odenisi");
    }

    @Then("Karta Medaxil URL-i dogrudur")
    public void kartaMedaxilURLiDogrudur() {
        onlaynPage.verifyUrlContains("/ferdi/karta-medaxil");
    }

    @Then("Sigorta URL-i dogrudur")
    public void sigortaURLiDogrudur() {
        onlaynPage.verifyUrlContains("/ferdi/sigorta");
    }

    @Then("Investisiya URL-i dogrudur")
    public void investisiyaURLiDogrudur() {
        onlaynPage.verifyUrlContains("/ferdi/investisiya");
    }

    @Then("Cash by Code URL-i dogrudur")
    public void cashByCodeURLiDogrudur() {
        onlaynPage.verifyUrlContains("/ferdi/cash-by-code");
    }

    @And("Istifadeci EN Kredit Odenisi sehifesine kecir")
    public void istifadeciENKreditOdenisiSehifesineKecir() {
        onlaynPage.navigateTo("/en/personal/loan-payment");
    }

    @Then("EN Kredit Odenisi sehifesi acilir")
    public void enKreditOdenisiSehifesiAcilir() {
        onlaynPage.waitForPageLoad();
    }
}
