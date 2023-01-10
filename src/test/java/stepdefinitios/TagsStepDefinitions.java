package stepdefinitios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinitions {
    @Given("Smoke test için hazirliklar yapildi")
    public void smokeTestIçinHazirliklarYapildi() {
    }

    @When("Smoke test calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("smoke calisti");
    }

    @Then("Smoke test basarili olmali")
    public void smokeTestBasariliOlmali() {
    }

    @Given("Regression test için hazirliklar yapildi")
    public void regressionTestIçinHazirliklarYapildi() {
    }

    @When("Regression test calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("regression calisti");
    }

    @Then("Regression test basarili olmali")
    public void regressionTestBasariliOlmali() {
    }
}
