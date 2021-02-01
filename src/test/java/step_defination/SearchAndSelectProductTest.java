package step_defination;

import java.io.IOException;

import org.testng.Assert;

import Base.TestBase;

import PageFactory.SearchAndSelect;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchAndSelectProductTest extends TestBase{
	SearchAndSelect Ser;
	
	
	public SearchAndSelectProductTest() throws IOException {
		super();
		Ser=new SearchAndSelect();
		 
	}

	@Given("User is already in the homepage")
	public void user_is_already_in_the_homepage() {
	   System.out.println(Ser.HomePageTitle());
	}

	@When("User able to Type desire product on Search box")
	public void user_able_to_type_desire_product_on_search_box() {
	    Ser.TypeOnSearchBox(); }

	@When("User shouold click on the submitSearch button")
	public void user_shouold_click_on_the_submit_search_button() {
	    Ser.submitSearchbuttonClick();
	}

	
	@Then("User should see the desire product")
	public void user_should_see_the_desire_product() {
		System.out.println(Ser.SearchProdectPageTitle());
		
 Assert.assertEquals(Ser.SearchProdectPageTitle(), "Search Results for wood stain at The Home Depot");
	   
	}

	@When("User should Select desier product")
	public void user_should_select_desier_product() {
	   Ser.SelectproductClick();
	}

	@When("User should click Add to Cart button")
	public void user_should_click_add_to_cart_button() {
	   Ser.AddtoCartClick();
	   
	}

	@When("User should click to the View cart")
	public void user_should_click_to_the_view_cart() {
		Ser.vewcart();
	}

	@Then("User should see the desire product Added to the cart")
	public void user_should_see_the_desire_product_added_to_the_cart() {
		
		System.out.println(Ser.CartPageTitle());
		
	   Assert.assertEquals(Ser.CartPageTitle(), "The Home Depot - Shopping Cart");
	}

}
