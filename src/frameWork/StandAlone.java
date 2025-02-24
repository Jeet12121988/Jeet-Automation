package frameWork;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import abstactMehodsReusable.BaseClass;
import jitendraSahuCompany.pageObjects.AddToCartPage;
import jitendraSahuCompany.pageObjects.ConfirmationPage;
import jitendraSahuCompany.pageObjects.LandingPage;
import jitendraSahuCompany.pageObjects.MyOrdersTest;
import jitendraSahuCompany.pageObjects.ProductsCataLog;
import jitendraSahuCompany.pageObjects.SumitOrderTest;

public class StandAlone extends BaseClass{

	  
    @Test(dataProvider="getData", groups= {"purchase"})
	public void sumitOrder(HashMap<String,String> input) throws Exception {
    
	
		ProductsCataLog pc=lp.loginApplication(input.get("email"), input.get("password"));
		
	
		pc.getProductByName(input.get("product"));
		AddToCartPage addToCartPage=pc.addTocart(input.get("product"));
		
	

		boolean match=addToCartPage.cartProductVerify(input.get("product"));
		
		AssertJUnit.assertTrue(match);

		addToCartPage.checkout();	;
		
	   SumitOrderTest sb=new SumitOrderTest(driver);
	   ConfirmationPage ConfirmationPage= sb.selectCountry("India");
	
	   
		String Confirmationmsg=ConfirmationPage.verifyConfirmationMessage();
		
		
	
	}

    @Test(dependsOnMethods= {"sumitOrder"})
    public void myOrdersTest() {
    	ProductsCataLog pc=lp.loginApplication("jeet@1212gmail.com", "Jeet!1234");
    	MyOrdersTest mo=new MyOrdersTest(driver);
    	boolean match=mo.myOrdersCheckTest("BANARSI SAREE");
    	
    	Assert.assertTrue(match);
    
    }
    
    @DataProvider
    public Object[][] getData() throws IOException {
    	
    	List<HashMap<String,String>> data=readDataFromJSON(System.getProperty("user.dir")+"\\src\\jitendraSahuCompany\\DataFiles\\Data.Json");
    	
    	
    	return new Object[][] {{data.get(0)},{data.get(1)}};
    }
    
	/*
	 * HashMap<Object,Object> map=new HashMap<Object,Object>(); map.put("email",
	 * "jeet@1212gmail.com"); map.put("password", "Jeet!1234"); map.put("product",
	 * "BANARSI SAREE");//ADIDAS ORIGINAL
	 * 
	 * HashMap<Object,Object> map1=new HashMap<Object,Object>(); map1.put("email",
	 * "jeet@1212gmail.com"); map1.put("password", "Jeet!1234"); map1.put("product",
	 * "ADIDAS ORIGINAL");//ADIDAS ORIGINAL
	 */    
}
