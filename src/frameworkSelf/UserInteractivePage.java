package frameworkSelf;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserInteractivePage extends BaseClass {
	public WebDriver driver;
	

	


	

	String productName;
	

	
	@Test(dataProvider="getData")
	public void shopping(HashMap<String,String> input) {
		
		BaseClass bb=new BaseClass();
		LoginPage lp=bb.BrowserInitialization();
		
		
		lp.goTo();
		ProductsPage pp=lp.login(input.get("email"),input.get("password"));
		MyCartPage mcart=pp.products(input.get("productName"));

	    boolean match= mcart.getProductOnCart(input.get("productName"));
	
		Assert.assertTrue(match);
		
	
	
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		List<HashMap<String,String>> data
		=readDataFromJSON();
		
		 return new Object[][] {{data.get(0)},{data.get(1)}};

		
//		HashMap<String,String> map=new HashMap<String,String>();
//		map.put("email", "jeet@1212gmail.com");
//		map.put("password", "Jeet!1234");
//		map.put("productName", "ADIDAS ORIGINAL");
//		
//		HashMap<String,String> map2=new HashMap<String,String>();
//		map2.put("email", "jeet@1212gmail.com");
//		map2.put("password", "Jeet!1234");
//		map2.put("productName", "IPHONE");
//		
//		
//		 return new Object[][] {{map},{map2}};
		
	
		
	}


}
