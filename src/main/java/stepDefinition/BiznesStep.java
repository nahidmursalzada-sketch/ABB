package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BiznesPage;

public class BiznesStep {

    BiznesPage biznesPage = new BiznesPage();

    @And("Istifadeci Korporativ linkine klik edir")
    public void istifadeciKorporativLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ");
    }

    @Then("Korporativ sehifesi acilir")
    public void korporativSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Kicik ve Orta Biznes linkine klik edir")
    public void istifadeciKicikVeOrtaBiznesLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/kicik-ve-orta-biznes");
    }

    @Then("Kicik ve Orta Biznes sehifesi acilir")
    public void kicikVeOrtaBiznesSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Mikro Biznes linkine klik edir")
    public void istifadeciMikroBiznesLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/mikro-biznes");
    }

    @Then("Mikro Biznes sehifesi acilir")
    public void mikroBiznesSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Korporativ kreditler linkine klik edir")
    public void istifadeciKorporativKreditlerLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/korporativ-kreditler");
    }

    @Then("Korporativ kreditler sehifesi acilir")
    public void korporativKreditlerSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Emekhaqi kartlari linkine klik edir")
    public void istifadeciEmekhaqiKartlariLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/odenis-kartlari-1/emekhaqqi-kartlari-1");
    }

    @Then("Emekhaqi kartlari sehifesi acilir")
    public void emekhaqiKartlariSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci VISA Business Platinum linkine klik edir")
    public void istifadeciVISABusinessPlatinumLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/odenis-kartlari-1/visa-business-platinum-1");
    }

    @Then("VISA Business Platinum sehifesi acilir")
    public void visaBusinessPlatinumSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Mastercard Corporate linkine klik edir")
    public void istifadeciMastercardCorporateLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/odenis-kartlari-1/mastercard-corporate-travel-expense");
    }

    @Then("Mastercard Corporate sehifesi acilir")
    public void mastercardCorporateSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Mastercard Business linkine klik edir")
    public void istifadeciMastercardBusinessLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/odenis-kartlari-1/mastercard-business-1");
    }

    @Then("Mastercard Business sehifesi acilir")
    public void mastercardBusinessSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci VISA Business linkine klik edir")
    public void istifadeciVISABusinessLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/odenis-kartlari-1/visa-business-1");
    }

    @Then("VISA Business sehifesi acilir")
    public void visaBusinessSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci VISA Business Gold linkine klik edir")
    public void istifadeciVISABusinessGoldLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/odenis-kartlari-1/visa-business-gold-1");
    }

    @Then("VISA Business Gold sehifesi acilir")
    public void visaBusinessGoldSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Gomruk Karti linkine klik edir")
    public void istifadeciGomrukKartiLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/odenis-kartlari-1/gomruk-karti-1");
    }

    @Then("Gomruk Karti sehifesi acilir")
    public void gomrukKartiSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Korporativ Pul Kocurmeleri linkine klik edir")
    public void istifadeciKorporativPulKocurmeleriLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/pul-kocurmeleri-1");
    }

    @Then("Korporativ Pul Kocurmeleri sehifesi acilir")
    public void korporativPulKocurmeleriSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Senedli Emeliyyatlar linkine klik edir")
    public void istifadeciSenedliEmeliyyatlarLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/senedli-emeliyyatlar");
    }

    @Then("Senedli Emeliyyatlar sehifesi acilir")
    public void senedliEmeliyyatlarSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci Ani Odenis Sistemi linkine klik edir")
    public void istifadeciAniOdenisSistemiLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/korporativ/ani-odenis-sistemi");
    }

    @Then("Ani Odenis Sistemi sehifesi acilir")
    public void aniOdenisSistemiSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci KOB Ani Kredit linkine klik edir")
    public void istifadeciKOBAniKreditLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/kicik-ve-orta-biznes/ani-kredit");
    }

    @Then("KOB Ani Kredit sehifesi acilir")
    public void kobAniKreditSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci KOB Sahibkar Krediti linkine klik edir")
    public void istifadeciKOBSahibkarKreditiLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/kicik-ve-orta-biznes/sahibkar-krediti");
    }

    @Then("KOB Sahibkar Krediti sehifesi acilir")
    public void kobSahibkarKreditiSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci KOB Qarantiya linkine klik edir")
    public void istifadeciKOBQarantiyaLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/kicik-ve-orta-biznes/qarantiya");
    }

    @Then("KOB Qarantiya sehifesi acilir")
    public void kobQarantiyaSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci KOB Odenis Kartlari linkine klik edir")
    public void istifadeciKOBOdenisKartlariLinkineKlikEdir() {
        biznesPage.navigateTo("/biznes/kicik-ve-orta-biznes/odenis-kartlari");
    }

    @Then("KOB Odenis Kartlari sehifesi acilir")
    public void kobOdenisKartlariSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @Then("Korporativ URL-i dogrudur")
    public void korporativURLiDogrudur() {
        biznesPage.verifyUrlContains("/biznes/korporativ");
    }

    @Then("KOB URL-i dogrudur")
    public void kobURLiDogrudur() {
        biznesPage.verifyUrlContains("/biznes/kicik-ve-orta-biznes");
    }

    @Then("Mikro Biznes URL-i dogrudur")
    public void mikroBiznesURLiDogrudur() {
        biznesPage.verifyUrlContains("/biznes/mikro-biznes");
    }

    @And("Istifadeci EN Korporativ sehifesine kecir")
    public void istifadeciENKorporativSehifesineKecir() {
        biznesPage.navigateTo("/en/business/corporate");
    }

    @Then("EN Korporativ sehifesi acilir")
    public void enKorporativSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci EN KOB sehifesine kecir")
    public void istifadeciENKOBSehifesineKecir() {
        biznesPage.navigateTo("/en/business/small-and-medium-business");
    }

    @Then("EN KOB sehifesi acilir")
    public void enKOBSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @And("Istifadeci EN Mikro Biznes sehifesine kecir")
    public void istifadeciENMikroBiznesSehifesineKecir() {
        biznesPage.navigateTo("/en/business/micro-business");
    }

    @Then("EN Mikro Biznes sehifesi acilir")
    public void enMikroBiznesSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @Then("Korporativ kreditler URL-i dogrudur")
    public void korporativKreditlerURLiDogrudur() {
        biznesPage.verifyUrlContains("/biznes/korporativ/korporativ-kreditler");
    }

    @Then("VISA Business Platinum URL-i dogrudur")
    public void visaBusinessPlatinumURLiDogrudur() {
        biznesPage.verifyUrlContains("/biznes/korporativ/odenis-kartlari-1/visa-business-platinum-1");
    }

    @Then("Emekhaqi kartlari URL-i dogrudur")
    public void emekhaqiKartlariURLiDogrudur() {
        biznesPage.verifyUrlContains("/biznes/korporativ/odenis-kartlari-1/emekhaqqi-kartlari-1");
    }

    @Then("KOB Ani Kredit URL-i dogrudur")
    public void kobAniKreditURLiDogrudur() {
        biznesPage.verifyUrlContains("/biznes/kicik-ve-orta-biznes/ani-kredit");
    }

    @And("Istifadeci EN Korporativ kreditler sehifesine kecir")
    public void istifadeciENKorporativKreditlerSehifesineKecir() {
        biznesPage.navigateTo("/en/business/corporate/corporate-loans");
    }

    @Then("EN Korporativ kreditler sehifesi acilir")
    public void enKorporativKreditlerSehifesiAcilir() {
        biznesPage.waitForPageLoad();
    }

    @Then("Mastercard Corporate URL-i dogrudur")
    public void mastercardCorporateURLiDogrudur() {
        biznesPage.verifyUrlContains("/biznes/korporativ/odenis-kartlari-1/mastercard-corporate-travel-expense");
    }
}
