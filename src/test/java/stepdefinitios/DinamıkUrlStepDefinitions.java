package stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class DinamıkUrlStepDefinitions {
    @Given("kullanici {string}sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sn) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sn));
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String baslık) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslık));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
