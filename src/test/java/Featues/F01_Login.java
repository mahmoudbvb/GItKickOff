package Featues;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class F01_Login {
    ChromeDriver driver;
    @Given("user opens website URL")
    public void user_opens_website_URL()
    {
        driver = new ChromeDriver();
        driver.get("");
    }

    @When("user enters valid username")
    public void user_enters_valid_username()
    {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    @And("user enters valid password")
    public void user_enters_valid_password()
    {
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
    }
    @And("user clicks login button")
    public void user_clicks_login_button()
    {
        driver.findElement(By.className("")).click();
    }
    @Then("user can login successfully")
    public void user_can_login_successfully()
    {
        boolean x =  driver.findElements(By.className("icon-signout")).isEmpty();
        Assert.assertEquals( x , false , "positive scenario failed!" );
    }

    @When("user enters invalid username")
    public void user_enters_invalid_username()
    {
        driver.findElement(By.id("username")).sendKeys("Mohamed");
    }
    @Then("user cannot login successfully")
    public void user_cannot_login_successfully()
    {
        boolean x =  driver.findElements(By.className("icon-signout")).isEmpty();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(x,true,"negative scenario failed");
        soft.assertAll();
    }

}
