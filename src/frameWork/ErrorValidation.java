package frameWork;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
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
import jitendraSahuCompany.pageObjects.ProductsCataLog;
import jitendraSahuCompany.pageObjects.SumitOrderTest;

public class ErrorValidation extends BaseClass{

	  
    @Test
	public void sumitOrder() throws Exception {
    
	
		ProductsCataLog pc=lp.loginApplication("jeet@1212gmail.com", "Jeet!12234");
		String err=lp.errorMsg();
		//Assert.assertTrue(err.equalsIgnoreCase("unknown error occured"), "la");
		
		AssertJUnit.assertEquals(err, "unknown error occured");
	
	
		
		
	
	}

}
