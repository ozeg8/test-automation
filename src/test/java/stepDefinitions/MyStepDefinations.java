package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utilities.MyDriver;

import java.time.Duration;

public class MyStepDefinations {

    private WebDriver driver;

    LoginPage loginPage;

    @Given("go to login page")
    public void go_to_login_page() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("click button")
    public void click_button() {
        loginPage.clickButton();
    }

    @Then("assert to success message")
    public void assert_to_success_message() {
        loginPage.assertToSuccessMessage();
        MyDriver.closeDriver();
        
    }


    @And("user types password as {string}")
    public void userTypesPasswordAs(String password) {
        loginPage.setPassword(password);
    }

    @And("user types username as {string}")
    public void userTypesUsernameAs(String username) {
        loginPage = new LoginPage(driver);
        loginPage.setUsername(username);
    }

    @Given("setting driver")
    public void settingDriver() {
        driver = MyDriver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("go to home page")
    public void goToHomePage() {
        driver.get("https://practicetestautomation.com/");
    }

    @When("wait two seconds")
    public void waitTwoSeconds() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("see {string} text")
    public void seeText(String text) {
        WebElement helloMessageWE = driver.findElement(By.className("post-title"));
        String helloMessage = helloMessageWE.getText();
        Assert.assertTrue(helloMessage.equals(text));
        MyDriver.closeDriver();
    }
}
