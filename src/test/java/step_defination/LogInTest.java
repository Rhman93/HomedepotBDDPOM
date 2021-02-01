package step_defination;

import java.io.IOException;

import org.testng.Assert;

import Base.TestBase;
import PageFactory.HomePageLink;
import PageFactory.LogIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LogInTest extends TestBase {
	LogIn LG;
	HomePageLink hp;
	
	public LogInTest() throws IOException {
		super();
		
		LG=new LogIn();
		hp=new 	HomePageLink();
	}
	

	
	
	@Given("User should be in the homepage")
	public void user_should_be_in_the_homepage() {
	    System.out.println(hp.gethomePageTitel());
	}

	@When("User able to click to the MyAccount link")
	public void user_able_to_click_to_the_my_account_link() {
	   
		hp.MyAccountClick();
	}

	@When("User able to click to SignIn Link")
	public void user_able_to_click_to_sign_in_link() {
	    hp.SignInClick();;
	}


	@Then("User will be in the SignIn Page")
	public void user_will_be_in_the_sign_in_page() {
	
		System.out.println(hp.SignInPAgeTitel());
		
	
	Assert.assertEquals(hp.SignInPAgeTitel(), "The Home Depot: sign in or create an account");
		 
	}

	@When("User should put Valied Email Address and password")
	public void user_should_put_valied_email_address_and_password() {
	   LG.TypeValiedEmail("ValiedEmail");
	   LG.TypePassword("valiedPassword");
	}

	@When("User should click to the SignIn button")
	public void user_should_click_to_the_sign_in_button() {
	    LG.SignInButtonClick();
	}

	@Then("User should be in his Account")
	public void user_should_be_in_his_account() {
		System.out.println(LG.AccountPAgeTitel());
		
		Assert.assertEquals(LG.AccountPAgeTitel(), "The Home Depot");
	}

	@When("User should put InValied Email Address and password")
	public void user_should_put_in_valied_email_address_and_password() {
	    LG.TypeInvaliedEmail("InvaliedEmail");
	    LG.TypeinvaliedPassword("InvaliedPassword");
	}
	
	@When("User able click to the SignIn button")
	public void user_able_click_to_the_sign_in_button() {
	    LG.SignInButtonClick();
	}
	
	@Then("User Unable to LogIn inthe Account")
	public void user_unable_to_log_in_inthe_account() {
		System.out.println(LG.UnableSignInPageTitel());
		Assert.assertEquals(LG.UnableSignInPageTitel(), "The Home Depot: sign in or create an account");

	  
		
	}

	

}
