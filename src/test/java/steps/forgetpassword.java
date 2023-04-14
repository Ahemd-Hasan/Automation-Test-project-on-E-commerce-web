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

public class forgetpassword {
    public static WebDriver driver = null;

    @Given("User opens browser and navigate to website")
    public void user_opens_browser_and_navigate_to_website()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/");


    }

    @When("user click on forget password")

    public void user_click_on_forget_password()
    {
       driver.findElement(By.linkText("Forgot Password")).click();
    }
    @And("user enters valid email")
    public void user_enters_valid_email()
    {
        driver.findElement(By.id("email")).sendKeys("ahmedpepeto97@gmail.com");
    }
    @And("user press on Retrieve password")
    public void user_press_on_Retrieve_password()
    {
        driver.findElement(By.cssSelector("i[class=\"icon-2x icon-signin\"]")).click();
    }
    @Then("password Retrieve successfully")
    public void password_Retrieve_successfully()
    {
        Assert.assertEquals(driver.getCurrentUrl().contains("forgot_password"),Boolean.TRUE);
    }

}
