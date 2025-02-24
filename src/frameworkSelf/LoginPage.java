package frameworkSelf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(id="userEmail")
	WebElement userName;
	
	@FindBy(id="userPassword")
	WebElement  passWord;
	
	@FindBy(id="login")
	WebElement submit;
	
	
	public ProductsPage login(String UserName,String Password) {
		   
	   
	    
			
		userName.sendKeys(UserName);
		passWord.sendKeys(Password);
		submit.click();
		ProductsPage pp=new ProductsPage(driver); 
		return pp;
	}
	
	
	public void goTo() {
		
		driver.get("https://rahulshettyacademy.com/client");
	}
	

}
