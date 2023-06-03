package stepdefinitios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SahibindenPage;
import utilities.Driver;

public class team2Definitions {
    @Given("Kullanici Sahibinden sayfasindadir")
    public void kullaniciSahibindenSayfasindadir() {

        Driver.getDriver().get("https://www.sahibinden.com/");
    }

    @When("Kullanici ev kelimesini arar")
    public void kullaniciEvKelimesiniArar() {
        SahibindenPage ev=new SahibindenPage(Driver.getDriver());
        ev.searchBox("ev" + Keys.ENTER);
    }

    @Then("Kullanici sayfada ev kelimesi gectigini dogrular")
    public void kullaniciSayfadaEvKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("ev"));
    }

   @When("Kullanici araba kelimesini arar")
   public void kullaniciArabaKelimesiniArar() {
       SahibindenPage araba=new SahibindenPage(Driver.getDriver());
       araba.searchBox("araba" + Keys.ENTER);

   }
       @Then("Kullanici sayfada araba kelimesi gectigini dogrular")
       public void kullaniciSayfadaArabaKelimesiGectiginiDogrular () {
           Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("araba"));
           Driver.closeDriver();
       }

   }