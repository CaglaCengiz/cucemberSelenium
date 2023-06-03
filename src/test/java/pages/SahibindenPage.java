package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SahibindenPage {
    private WebDriver driver;

    public SahibindenPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //searchText
    }

    @FindBy(id = "searchText")
    WebElement searchText;

    @FindBy(xpath = "//div[@class='results-header']")
    WebElement result;

    public void searchBox(String key) {
        searchText.sendKeys(key);
    }

    public void result() {
        System.out.println("result.getText() = " + result.getText());


    }
}