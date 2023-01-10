package stepdefinitios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleOdev1Definitions {
    @Given("Kullanici googla gider")
    public void kullaniciGooglaGider() {
        Driver.getDriver().get("https://google.com/");
    }

    @When("Arama kismina cucumber yazar")
    public void aramaKisminaCucumberYazar() {
        GoogleSearchPage as=new GoogleSearchPage(Driver.getDriver());
        as.searchFor("cucumber");
    }

    @Then("Kullanici title da cucumber yazisi oldugunu kontrol eder")
    public void kullaniciTitleDaCucumberYazisiOldugunuKontrolEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
        Driver.closeDriver();
    }
}
