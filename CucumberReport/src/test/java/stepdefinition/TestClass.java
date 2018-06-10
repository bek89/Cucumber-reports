package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.FacebookPages;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class TestClass {

	public static FacebookPages fPages=new FacebookPages();

	WebDriver driver= null;
	@Given("^User is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
    BrowserDriver.getInstance().get(ConfigReader.getProperty("url"));
   driver.manage().window().maximize();
}

@When("^User enters UserName and Password$")
public void user_enters_UserName_and_Password() throws Throwable {
	 fPages.email.sendKeys("ulugbekrahmonov7@gmail.com");
	 fPages.password.sendKeys("Kasalapi123");
}

@When("^Clicks on login button$")
public void clicks_on_login_button() throws Throwable {
   
  // System.out.println(" Im in a Facebook page");
	Assert.assertTrue( fPages.loginBtn.isDisplayed());
	 //fPages.loginBtn.click();
}

}
