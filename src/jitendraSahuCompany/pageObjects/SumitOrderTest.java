package jitendraSahuCompany.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstactMehodsReusable.ReusableMehods;
import frameWork.StandAlone;

public class SumitOrderTest extends ReusableMehods {
	
	WebDriver driver;
	
	public SumitOrderTest(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	 @FindBy(xpath="//input[@placeholder='Select Country']")
	 WebElement  select;
	 
	 @FindBy(xpath="//button[@class='ta-item list-group-item ng-star-inserted'] [2]")
	 WebElement  SelectCountry;
	 
	 @FindBy(css=".btnn.action__submit")
	 WebElement  submit;
	 
	 By result=By.cssSelector("ta-results");
	
	 
	 public ConfirmationPage selectCountry(String Country) throws InterruptedException {
		 Thread.sleep(2000);
		 WebElement selectConuntry=select;
		 selectConuntry.sendKeys(Country);
		 
		// elementsToBeApper(result);
		 Thread.sleep(2000);
		 
		
		 javaScripts("Click", SelectCountry);
		 
		 javaScripts("Click", submit);
		 ConfirmationPage confirmationPage=new ConfirmationPage(driver);
		 return  confirmationPage;
		 
		 
	 }
	 
	 
	 

}
