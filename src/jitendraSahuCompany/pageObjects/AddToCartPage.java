package jitendraSahuCompany.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import abstactMehodsReusable.ReusableMehods;

public class AddToCartPage extends ReusableMehods {
	
	
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
	    
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css=".cartSection h3")
	List<WebElement> products;
	
	@FindBy(css=".totalRow button")
	WebElement Checkout;
	
	
	
	
	By cartSection=By.className("cartSection");
	

     public boolean cartProductVerify(String productName) {
    	   
    	   elementsToBeApper(cartSection);
    	 
    		//List<WebElement> products =driver.findElements(By.cssSelector(".cartSection h3"));
    		boolean match=products.stream().anyMatch(a->a.getText().equalsIgnoreCase(productName));
    		return match;
    	
    	
     }
  
     
     public void checkout() {
    	 Checkout.click();
     }

}
