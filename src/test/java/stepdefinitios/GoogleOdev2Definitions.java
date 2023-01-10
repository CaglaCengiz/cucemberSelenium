package stepdefinitios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleOdev2Definitions {
    @Given("Kullanıcı Google a gider")
    public void kullanıcıGoogleAGider() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("Kullanıcı selenyumu aratır")
    public void kullanıcıSelenyumuAratır() {
        GoogleSearchPage sa=new GoogleSearchPage(Driver.getDriver());
        sa.searchFor("selenium");
    }

    @Then("Selenyum kelimesinin gectiğini title de dogrular")
    public void selenyumKelimesininGectiğiniTitleDeDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
        Driver.getDriver().close();
    }
}
