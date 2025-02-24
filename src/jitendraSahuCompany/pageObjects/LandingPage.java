package jitendraSahuCompany.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstactMehodsReusable.ReusableMehods;

public class LandingPage  extends ReusableMehods{
	
	WebDriver driver;
	
	
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	//WebElement username =driver.findElement(By.id("userEmail"));
	@FindBy(id="userEmail")
	WebElement username;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement submit;
	
	//toast-container
	@FindBy(id="toast-container")
	WebElement ErrorMsg;
	
	public ProductsCataLog loginApplication(String usernameLogin, String passwordLogin) {
		
		username.sendKeys(usernameLogin);
		password.sendKeys(passwordLogin);
		submit.click();
		ProductsCataLog pc=new ProductsCataLog(driver);
		return pc;
		
	}
	
	

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
		
	}
	
	public String errorMsg() {
		
		String ErrorMsg1=ErrorMsg.getText();
		return ErrorMsg1;
		
	}

}
