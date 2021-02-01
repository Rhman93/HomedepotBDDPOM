package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePageLink extends TestBase {

	
public HomePageLink() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="My Account")
	WebElement  MyAccountlink;
	
	@FindBy(xpath="//span[text()=' Sign in ']")
	WebElement SignInLink;
	
	@FindBy(linkText="All Departments")
	WebElement AllDepertmentLink;
	
	@FindBy(linkText="Installation & Services")
	WebElement InstallationLink;
	
	@FindBy(xpath="//span[text()='items']")
	WebElement CartLink;
	
	
	public String GetHomePageText() {
		return MyAccountlink.getText();
		
	}
	
	public void BacktoHomePage() {
		driver.navigate().back();
	}
	
	
	public void MyAccountClick() {
		MyAccountlink.click();
	}
	
	public void SignInClick() {
		SignInLink.click();
	}
	
	public void AllDepertmentClick() {
		AllDepertmentLink.click();
	}
	
	public void InstallationClick() {
		InstallationLink.click();
	}
	
	public void CartClick() {
		CartLink.click();
	}
	
	public String gethomePageTitel() {
		return driver.getTitle();
		
	}
	
	public String SignInPAgeTitel() {
		return driver.getTitle();
		
	}
	
	public String SitemapPAgeTitel() {
		return driver.getTitle();
		
	}
	public String InstallationPageTitle() {
		return driver.getTitle();
		
	}
	public String CartPageTitel() {
		return driver.getTitle();
		
	}
	
}

	
	
	