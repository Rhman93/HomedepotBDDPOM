package step_defination;



import java.io.IOException;


import org.testng.Assert;

import Base.TestBase;
import PageFactory.HomePageLink;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HomePageFunctionalityTest2 extends TestBase {
	
	HomePageLink hp;
	public HomePageFunctionalityTest2() throws IOException {
		super();
		 hp=new HomePageLink();
	}
	
	
  
  

	@Given("User is in the homepage")
	public void user_is_in_the_homepage() {
	    System.out.println(hp.gethomePageTitel());
	   
	}
	@When("User should click to the MyAccount link")
	public void user_should_click_to_the_my_account_link() {
	    hp.MyAccountClick();
	}

	@When("User Should click to SignIn Link")
	public void user_should_click_to_sign_in_link() {
	   hp.SignInClick();
	}

	@Then("User should be in the SignIn Page")
	public void user_should_be_in_the_sign_in_page() {
		Assert.assertEquals(hp.SitemapPAgeTitel(), "The Home Depot: sign in or create an account");
	  // Assert.assertEquals(hp.SignInPAgeTitel(), "The Home Depot: sign in or create an account");
	hp.BacktoHomePage();
	}

	@When("User should click to the AllDepertment link")
	public void user_should_click_to_the_all_depertment_link() {
	   hp.AllDepertmentClick();
	}

	@Then("User should be in the Sitemap The Home Depot Page")
	public void user_should_be_in_the_sitemap_the_home_depot_page() {
	 Assert.assertEquals(hp.SitemapPAgeTitel(), "SiteMap");
	 
	//Assert.assertEquals(hp.SitemapPAgeTitel(), "SiteMap");
	hp.BacktoHomePage();
	}

	@When("User should click to the Installation & Service Link")
	public void user_should_click_to_the_installation_service_link() {
	   hp.InstallationClick();
	}

	@Then("User should be in the Installation Page")
	public void user_should_be_in_the_installation_page() {
	    Assert.assertEquals(hp.InstallationPageTitle(), "Home Services: Install, Repair & Remodel - The Home Depot");
	hp.BacktoHomePage();
	}

	@When("User should click to the Cart link")
	public void user_should_click_to_the_cart_link() {
	   hp.CartClick();
	}

	@Then("User should be in the Cart Page")
	public void user_should_be_in_the_cart_page() {
	   Assert.assertEquals(hp.CartPageTitel(), "The Home Depot - Shopping Cart");
	
	}
	
	
}
	
	