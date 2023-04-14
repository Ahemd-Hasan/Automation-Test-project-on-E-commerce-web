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

public class D05_hoverCategoriesStepDef {
    public static WebDriver driver = null;

    @Given("User opens browser and navigate to theee the website")
    public void user_opens_browser_and_navigate_to_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("chose the euro")
    public void choseeuro() throws InterruptedException {
        Select euro = new Select(driver.findElement(By.id("customerCurrency")));
        euro.selectByIndex(1);
        Thread.sleep(3000);
    }

    @Then("successs message is displayed")
    public void successfulyy() {
        Assert.assertEquals(driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).getText(), "Euro");
        Assert.assertEquals(driver.findElement(By.className("price")).getText(),"€1032.00");

     //   System.out.println(driver.findElement(By.className("price")).getText());
    }

}
