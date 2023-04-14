package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class followUsStepDef {
    public static WebDriver driver = null;
    Actions action = new Actions(driver);

    @Given("User opens browser and navigate to theeee the website")
    public void gotothewebsite()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user opens youtube link")
    public void user_opens_youtube_link(){
        driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();}

        @Then("youtube is opened in new tab")
        public void youtube_is_opened_in_new_tab() throws InterruptedException {
            Assert.assertEquals(driver.findElement(By.id("logo-icon")).getText(),"Youtube");
            Thread.sleep(5000);

        }



}
