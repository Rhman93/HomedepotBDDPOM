package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LogIn extends TestBase{

	
	
		
	@FindBy(id="email")
	WebElement EmailElement;

  @FindBy(id="password-input-field")
   WebElement PasswordElement;
  
  @FindBy(xpath="//span[text()='Sign In']")
  WebElement SignInButton;
  
  @FindBy(xpath="//p[text()='Sign In to Your Account']")
  WebElement SInInMessage;
  
 
 public LogIn() throws IOException {
		PageFactory.initElements(driver, this);
			}
  
  public String AccountPAgeTitel() {
	return driver.getTitle();
	  
  }
 
  
  public String UnableSignInPageTitel() {
	return driver.getTitle();
	  
  }
  
  
  public void TypeValiedEmail(String UserEmail) {
	  EmailElement.sendKeys(Prop.getProperty(UserEmail));
  }
  public void TypePassword(String UserPassword) {
	  PasswordElement.sendKeys(Prop.getProperty(UserPassword));
  }
  
  public void SignInButtonClick() {
	  SignInButton.click();
  }
  
 
  
  public void TypeInvaliedEmail(String userEmail) {
	  EmailElement.sendKeys(Prop.getProperty(userEmail));
  }
  public void TypeinvaliedPassword(String userPassword) {
	  PasswordElement.sendKeys(Prop.getProperty(userPassword));
  }
  
 
  
}
  
  
