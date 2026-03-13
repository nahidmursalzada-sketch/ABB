package stepDefinition;

import config.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class  HomePageStep {

    HomePage homePage = new HomePage();

    @Given("Istifadeci ABB Bank saytina daxil olur")
    public void istifadeciABBBankSaytinaDaxilOlur() {
        WebDriverManager.getChromeDriver().get("https://abb-bank.az/az");
        WebDriverManager.getChromeDriver().manage().window().maximize();
        homePage.waitForPageLoad();
    }

    @Then("Ana sehife ugurla yuklenir")
    public void anaSehifeUgurlaYuklenir() {
        homePage.waitForPageLoad();
    }

    @When("Istifadeci banner next butonuna klik edir")
    public void istifadeciBannerNextButonaKlikEdir() {
        homePage.clickBannerNext();
    }

    @Then("Banner deyisir")
    public void bannerDeyisir() {
        homePage.waitForPageLoad();
    }

    @Then("Valyuta mezenneleri gorsenmelidir")
    public void valyutaMezenneleriGorsenmelidir() {
        homePage.clickValyuta();
    }

    @When("Istifadeci EN diline kecid edir")
    public void istifadeciENDilineKecidEdir() {
        config.WebDriverManager.getChromeDriver().get("https://abb-bank.az/en");
        homePage.waitForPageLoad();
    }

    @Then("Sehife ingilis dilinde acilir")
    public void sehifeIngilisdildeAcilir() {
        homePage.waitForPageLoad();
    }

    @When("Istifadeci filiallar linkine klik edir")
    public void istifadeciFiliallarLinkineKlikEdir() {
        homePage.clickFiliallar();
    }

    @Then("Filiallar sehifesi acilir")
    public void filiallarSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @When("Istifadeci Ferdi menusunun uzerine gelir")
    public void istifadeciFerdiMenusununUzerineGelir() {
        homePage.hoverFerdiMenu();
    }

    @When("Istifadeci Biznes menusunun uzerine gelir")
    public void istifadeciBiznesMenusununUzerineGelir() {
        homePage.hoverBiznesMenu();
    }

    @When("Istifadeci Haqqimizda menusunun uzerine gelir")
    public void istifadeciHaqqimizdaMenusununUzerineGelir() {
        homePage.hoverHaqqimizdaMenu();
    }

    @When("Istifadeci banner prev butonuna klik edir")
    public void istifadeciBannerPrevButonaKlikEdir() {
        homePage.clickBannerPrev();
    }

    @Then("Banner geri deyisir")
    public void bannerGeriDeyisir() {
        homePage.waitForPageLoad();
    }

    @When("Istifadeci valyuta mezenneleri linkine klik edir")
    public void istifadeciValyutaMezenneleriLinkineKlikEdir() {
        homePage.navigateTo("/ferdi/valyuta-mezenneleri");
    }

    @Then("Valyuta mezenneleri sehifesi acilir")
    public void valyutaMezenneleriSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @When("Istifadeci investorlarla elaqe linkine klik edir")
    public void istifadeciInvestorlarlaElaqeLinkineKlikEdir() {
        homePage.navigateTo("/investorlarla-elaqe");
    }

    @Then("Investorlarla elaqe sehifesi acilir")
    public void investorlarlaElaqeSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @And("Istifadeci Ferdi linkine klik edir")
    public void istifadeciFerdiLinkineKlikEdir() {
        homePage.navigateTo("/ferdi");
    }

    @Then("Ferdi sehifesi acilir")
    public void ferdiSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @And("Istifadeci Biznes linkine klik edir")
    public void istifadeciBiznesLinkineKlikEdir() {
        homePage.navigateTo("/biznes/korporativ");
    }

    @Then("Biznes sehifesi acilir")
    public void biznesSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @And("Istifadeci Haqqimizda linkine klik edir")
    public void istifadeciHaqqimizdaLinkineKlikEdir() {
        homePage.navigateTo("/haqqimizda");
    }

    @Then("Haqqimizda sehifesi acilir")
    public void haqqimizdaSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @And("Istifadeci EN ferdi sehifesine kecir")
    public void istifadeciENFerdiSehifesineKecir() {
        homePage.navigateTo("/en/personal");
    }

    @Then("EN ferdi sehifesi acilir")
    public void enFerdiSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @And("Istifadeci EN biznes sehifesine kecir")
    public void istifadeciENBiznesSehifesineKecir() {
        homePage.navigateTo("/en/business/corporate");
    }

    @Then("EN biznes sehifesi acilir")
    public void enBiznesSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @And("Istifadeci EN haqqimizda sehifesine kecir")
    public void istifadeciENHaqqimizdaSehifesineKecir() {
        homePage.navigateTo("/en/about-us");
    }

    @Then("EN haqqimizda sehifesi acilir")
    public void enHaqqimizdaSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @When("Istifadeci kampaniyalar sehifesine kecir")
    public void istifadeciKampaniyalarSehifesineKecir() {
        homePage.navigateTo("/kampaniyalar");
    }

    @Then("Kampaniyalar sehifesi acilir")
    public void kampaniyalarSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @When("Istifadeci xeberler sehifesine kecir")
    public void istifadeciXeberlerSehifesineKecir() {
        homePage.navigateTo("/xeberler");
    }

    @Then("Xeberler sehifesi acilir")
    public void xeberlerSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @When("Istifadeci karyera sehifesine kecir")
    public void istifadeciKaryeraSehifesineKecir() {
        homePage.navigateTo("/karyera");
    }

    @Then("Karyera sehifesi acilir")
    public void karyeraSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @And("Istifadeci EN kampaniyalar sehifesine kecir")
    public void istifadeciENKampaniyalarSehifesineKecir() {
        homePage.navigateTo("/en/campaigns");
    }

    @Then("EN kampaniyalar sehifesi acilir")
    public void enKampaniyalarSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @And("Istifadeci EN xeberler sehifesine kecir")
    public void istifadeciENXeberlerSehifesineKecir() {
        homePage.navigateTo("/en/news");
    }

    @Then("EN xeberler sehifesi acilir")
    public void enXeberlerSehifesiAcilir() {
        homePage.waitForPageLoad();
    }

    @Then("Filiallar URL-i dogrudur")
    public void filiallarURLiDogrudur() {
        homePage.verifyUrlContains("/filiallar");
    }

    @Then("Valyuta mezenneleri URL-i dogrudur")
    public void valyutaMezenneleriURLiDogrudur() {
        homePage.verifyUrlContains("/valyuta-mezenneleri");
    }
}
