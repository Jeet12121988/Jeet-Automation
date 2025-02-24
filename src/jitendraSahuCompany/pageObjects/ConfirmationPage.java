package jitendraSahuCompany.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstactMehodsReusable.ReusableMehods;

public class ConfirmationPage extends ReusableMehods{
	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".hero-primary")
	WebElement ConfirmationMsg;
	
	public String verifyConfirmationMessage() {
		return ConfirmationMsg.getText();
		
		
	}
	

}
