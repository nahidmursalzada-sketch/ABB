package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.KreditlerPage;

public class KreditlerStep {

    KreditlerPage kreditlerPage = new KreditlerPage();

    @And("Istifadeci Kreditler alt menusuna klik edir")
    public void istifadeciKreditlerAltMenusunaKlikEdir() {
        kreditlerPage.navigateTo("/ferdi/kreditler");
    }

    @And("Istifadeci Nagd kredit linkine klik edir")
    public void istifadeciNagdKreditLinkineKlikEdir() {
        kreditlerPage.navigateTo("/ferdi/kreditler/nagd-kredit");
    }

    @Then("Nagd kredit sehifesi acilir")
    public void nagdKreditSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci Avans kredit linkine klik edir")
    public void istifadeciAvansKreditLinkineKlikEdir() {
        kreditlerPage.navigateTo("/ferdi/kreditler/avans-kredit-xetti");
    }

    @Then("Avans kredit sehifesi acilir")
    public void avansKreditSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci Indi al sonra ode linkine klik edir")
    public void istifadeciIndiAlSonraOdeLinkineKlikEdir() {
        kreditlerPage.navigateTo("/ferdi/kreditler/indi-al-sonra-ode");
    }

    @Then("Indi al sonra ode sehifesi acilir")
    public void indiAlSonraOdeSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci Avtomobil krediti linkine klik edir")
    public void istifadeciAvtomobilKreditiLinkineKlikEdir() {
        kreditlerPage.navigateTo("/ferdi/kreditler/avtomobil-krediti");
    }

    @Then("Avtomobil krediti sehifesi acilir")
    public void avtomobilKreditiSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci Emanetci nagd krediti linkine klik edir")
    public void istifadeciEmanetciNagdKreditiLinkineKlikEdir() {
        kreditlerPage.navigateTo("/ferdi/kreditler/emanetci-nagd-krediti");
    }

    @Then("Emanetci nagd krediti sehifesi acilir")
    public void emanetciNagdKreditiSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci Ipoteka krediti linkine klik edir")
    public void istifadeciIpotekaKreditiLinkineKlikEdir() {
        kreditlerPage.navigateTo("/ferdi/kreditler/ipoteka-krediti");
    }

    @Then("Ipoteka krediti sehifesi acilir")
    public void ipotekaKreditiSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci Emanetci kredit limiti linkine klik edir")
    public void istifadeciEmanetciKreditLimitiLinkineKlikEdir() {
        kreditlerPage.navigateTo("/ferdi/kreditler/emanetci-kredit-limiti");
    }

    @Then("Emanetci kredit limiti sehifesi acilir")
    public void emanetciKreditLimitiSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @Then("Kreditler sehifesi acilir")
    public void kreditlerSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci EN nagd kredit sehifesine kecir")
    public void istifadeciENNagdKreditSehifesineKecir() {
        kreditlerPage.navigateTo("/en/personal/loans/cash-loan");
    }

    @Then("EN nagd kredit sehifesi acilir")
    public void enNagdKreditSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci EN avans kredit sehifesine kecir")
    public void istifadeciENAvansKreditSehifesineKecir() {
        kreditlerPage.navigateTo("/en/personal/loans/advance-credit-line");
    }

    @Then("EN avans kredit sehifesi acilir")
    public void enAvansKreditSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci EN ipoteka krediti sehifesine kecir")
    public void istifadeciENIpotekaKreditiSehifesineKecir() {
        kreditlerPage.navigateTo("/en/personal/loans/mortgage-loan");
    }

    @Then("EN ipoteka krediti sehifesi acilir")
    public void enIpotekaKreditiSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @And("Istifadeci EN avtomobil krediti sehifesine kecir")
    public void istifadeciENAvtomobilKreditiSehifesineKecir() {
        kreditlerPage.navigateTo("/en/personal/loans/auto-loan");
    }

    @Then("EN avtomobil krediti sehifesi acilir")
    public void enAvtomobilKreditiSehifesiAcilir() {
        kreditlerPage.waitForPageLoad();
    }

    @Then("Nagd kredit URL-i dogrudur")
    public void nagdKreditURLiDogrudur() {
        kreditlerPage.verifyUrlContains("/ferdi/kreditler/nagd-kredit");
    }

    @Then("Ipoteka krediti URL-i dogrudur")
    public void ipotekaKreditiURLiDogrudur() {
        kreditlerPage.verifyUrlContains("/ferdi/kreditler/ipoteka-krediti");
    }

    @Then("Avans kredit URL-i dogrudur")
    public void avansKreditURLiDogrudur() {
        kreditlerPage.verifyUrlContains("/ferdi/kreditler/avans-kredit-xetti");
    }

    @Then("Avtomobil krediti URL-i dogrudur")
    public void avtomobilKreditiURLiDogrudur() {
        kreditlerPage.verifyUrlContains("/ferdi/kreditler/avtomobil-krediti");
    }

    @Then("Emanetci nagd krediti URL-i dogrudur")
    public void emanetciNagdKreditiURLiDogrudur() {
        kreditlerPage.verifyUrlContains("/ferdi/kreditler/emanetci-nagd-krediti");
    }

    @Then("Indi al sonra ode URL-i dogrudur")
    public void indiAlSonraOdeURLiDogrudur() {
        kreditlerPage.verifyUrlContains("/ferdi/kreditler/indi-al-sonra-ode");
    }
}
