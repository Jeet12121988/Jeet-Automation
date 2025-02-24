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

public class ProductsCataLog extends ReusableMehods {
	
	
	WebDriver driver;
	
	public ProductsCataLog(WebDriver driver) {
	    
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css="b")
	WebElement text;
	
	@FindBy(css="[routerlink$='/dashboard/cart']")
	WebElement cart;
	
	
	By Byproducts1=By.cssSelector(".mb-3");
	By addTocart=By.cssSelector(".card-body button:last-of-type");
	By msg=By.cssSelector("#toast-container");
	
	
	
	
	
	  public List<WebElement> getProductList() {
		  
		  
		 elementsToBeApper(Byproducts1);
		
		 return products;
	  }
	  
	  public WebElement getProductByName(String productName) {
		   WebElement prod=getProductList().stream().filter(s->s.findElement(By.cssSelector("b")).getText().equals
		    		(productName)).findFirst().orElse(null);
		   
		   return prod;
	  }
	
     public AddToCartPage addTocart(String productName) {
    	 
    	WebElement prod =getProductByName(productName).findElement(addTocart);
    	javaScripts("Border", prod);
    	javaScripts("Click", prod);
    	elementsToBeApper(msg);
    	javaScripts("Click", cart);
    	
    	AddToCartPage addToCartPage=new AddToCartPage(driver);
    	return addToCartPage;
    	
    	
     }
  

}
