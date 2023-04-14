package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovercategories {
    public static WebDriver driver = null;


    @Given("User opens browser and navigate to theeeee the website")
    public void gotothewebsite()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("click on computer catogry")
    public void clickoncatogry(){

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Computers"))).perform();
    }
    @Then("Select one of category")
    public void Select_one_of_category(){
        driver.findElement(By.cssSelector("a[href=\"/notebooks\"]")).click();

    }
}
