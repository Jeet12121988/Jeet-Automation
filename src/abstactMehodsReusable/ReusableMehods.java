package abstactMehodsReusable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMehods {
	WebDriver driver;
	 
	public ReusableMehods(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//button[.='  ORDERS']")
	WebElement MyOrder;
	
	public void elementsToBeApper(By Locator) {
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}
	
	public void goToCart() {
		
		
	}
	
	public void javaScripts(String Operation,WebElement prod) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		if(Operation.contains("Border"))
		{
            js.executeScript("arguments[0].style.border='2px solid red'",prod);
		}
		if(Operation.equalsIgnoreCase("click")) {
	        js.executeScript("arguments[0].click();", prod);
		}
	}
	
	public void clickToMyOrders() {
		MyOrder.click();
		
	}
	

}
