package frameworkSelf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstactMehodsReusable.ReusableMehods;
import frameworkSelf.AbstracClasses.ReusableMethods;

public class ProductsPage extends ReusableMethods{
    WebDriver driver;
	
    
    public ProductsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
    
     @FindBy(css=".mb-3")
     List<WebElement> Products;
     
    By productName=By.cssSelector(".mb-3");
    By toaster=By.cssSelector(".ng-tns-c31-1.ng-star-inserted");
    By messageForAdded=By.cssSelector("#toast-container");
     
     
     public MyCartPage products(String mYProduct) {
    	 
    	 waitForElementToVisible(productName);
    	 
    	 WebElement product= Products.stream().filter(a->a.findElement(By.cssSelector("b")).getText().contains(mYProduct)).findAny().orElse(null);
    	 product.findElement(By.cssSelector(".card-body button:nth-of-type(2)")).click();
    	 
    	 waitForElementToBeInvisible(toaster);
    	 waitForElementToVisible(messageForAdded);
    	 MyCartPage mcart=new MyCartPage(driver);
    	 return mcart;
     }


	
	
	

}
