package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SearchAndSelect extends TestBase{

	public SearchAndSelect() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="headerSearch")
	WebElement TypeProductNmae;
	
	@FindBy(id="headerSearchButton")
	WebElement submitSearchbutton;
	
	@FindBy(xpath="//*[@id=\"products\"]/div/div[1]/div/div[3]/div[1]/a")
	WebElement Selectproduct;
	
	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/div[2]/div[2]/div[2]/div[15]/div[3]/div[2]/div[2]/div[1]/button/span")
	WebElement AddtoCart;
	
	@FindBy(xpath="/html/body/article/div/div/div/div/div/div[1]/div[2]/div[1]/div/a")
	WebElement VewCart;
	
	public String HomePageTitle() {
		return driver.getTitle();
		}
	
	public String SearchProdectPageTitle() {
		return driver.getTitle();
		}
	public String CartPageTitle() {
		return driver.getTitle();
		}
	


public void submitSearchbuttonClick() {
	submitSearchbutton.click();
}

public void SelectproductClick() {
	Selectproduct.click();
}

public void AddtoCartClick() {
	AddtoCart.click();
}

public void vewcart() {
	VewCart.click();
}

public void TypeOnSearchBox() {
	
	TypeProductNmae.sendKeys("wood stain");
}


}
