package stepdefinitios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {
    @Given("Ilk feature icin cucumber indirdim")
    public void ılk_feature_icin_cucumber_indirdim() {
        System.out.println("Given calisti");

    }
    @When("Senaryomu calistirdigimda")
    public void senaryomu_calistirdigimda() {
        System.out.println("When calisti");

    }
    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("Then calisti");

    }

}
