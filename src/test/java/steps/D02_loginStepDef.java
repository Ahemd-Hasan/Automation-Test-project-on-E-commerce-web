package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D02_loginStepDef {

    public static WebDriver driver = null;

    @Given("User opens browser and navigate to thee the website")
    public void user_opens_browser_and_navigate_to_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user go to login page")
    public void gotologin() {
        driver.findElement(By.className("ico-login")).click();
    }

    @When("user login with \"valid\" \"test@example.com\" and \"P@ssw0rd\"")

    public void logwithvalid() {

        driver.findElement(By.id("Email")).sendKeys("ahmedpepeto@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("SuperSecretPassword!");

    }
    @Then("user press on login button")
    public void pressonloginbutton()
    {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
    @And("user login to the system successfully")
    public void successfuly()
    {

        Assert.assertEquals(driver.findElement(By.className("ico-account")).isDisplayed(),Boolean.TRUE);
    }





}
