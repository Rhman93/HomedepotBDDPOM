package Base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static  WebDriver driver;
	public static Properties Prop;
	
	public TestBase() throws IOException {
	 Prop=new Properties();
		FileInputStream Fil=new FileInputStream("/Users/ahmedshuily/eclipse-workspace"
				+ "/homwDepotBDD/src/main/java/Property/Config.Propertyes");
		Prop.load(Fil);
		
	}
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ahmedshuily/Desktop/untitled folder/chromedriver");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Prop.getProperty("Url"));
		}
	
	
	
	public void TearDown() {
		driver.close();
	}

}
