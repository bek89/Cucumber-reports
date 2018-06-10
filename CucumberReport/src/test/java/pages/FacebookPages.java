package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserDriver;
 

 public class FacebookPages {

	 private WebDriver driver;
	 public FacebookPages(){
     this.driver=BrowserDriver.getInstance();
	PageFactory.initElements(driver, this);
}
 

@FindBy(id="email")
public WebElement email;

@FindBy(id="pass")
public WebElement password;


@FindBy(xpath="//input[@value='Log In']f")
public WebElement loginBtn; 

}




