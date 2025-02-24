package frameworkSelf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {
	
	WebDriver driver;
	public MyCartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 driver.findElement(By.xpath("//button[contains(.,'Cart ')]")).click();
			driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	}
	
	
	@FindBy(xpath="//div[@class='cartSection']")
	List<WebElement>  cartProduct;
	
	
	

	public boolean getProductOnCart(String ProductName) {
		
		boolean match=cartProduct.stream().anyMatch(a->a.findElement(By.tagName("h3")).getText().contains(ProductName));
		return match;
		
	}
	
	

}
