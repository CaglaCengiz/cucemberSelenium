package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("Before methodu calıstı");
    }
    @After
    public void teardown(){
        System.out.println("After methodu calıstı");
        Driver.closeDriver();
    }
}
