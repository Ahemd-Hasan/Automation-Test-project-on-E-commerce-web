package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginstep {
    public static WebDriver driver = null;



    @Given("User opens browser and navigate to the website")
    public void user_opens_browser_and_navigate_to_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @And("user go to register page")
    public void user_go_to_register_page() {
        driver.findElement(By.linkText("Register")).click();
    }

    @When("user select gender type")

    public void user_select_gender_type() {

        driver.findElement(By.id("gender-male")).click();

    }

    @And("user enter first name \"automation\" and last name \"tester\"")
    public void enterFirstAndLastName() {
        driver.findElement(By.id("FirstName")).sendKeys("ahmed");
        driver.findElement(By.id("LastName")).sendKeys("SuperSecretPassword!");

    }

    @And("user enter date of birth")
    public void enterdateofbirth()
    {
        Select birthday = new Select(driver.findElement(By.name("DateOfBirthDay")));
        birthday.selectByValue("1");
        Select monthday = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        monthday.selectByValue("2");
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue("1912");
    }

    @And("user enter email \"test@example.com\" field")

    public void enteemail()
    {
        driver.findElement(By.id("Email")).sendKeys("ahmedpepeto@gmail.com");
    }

    @And("user fills Password fields")

    public void enterpassword()
    {
        driver.findElement(By.id("Password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("SuperSecretPassword!");
    }

    @And("user clicks on register button")

    public void enetrregisterbutton()
    {
        driver.findElement(By.id("register-button")).click();
    }
    @Then("success message is displayed")
    public void successmassege()
    {
       driver.findElement(By.className("result")).isDisplayed();
        Assert.assertEquals(  driver.findElement(By.className("result")).isDisplayed(),Boolean.TRUE);
    }



}

