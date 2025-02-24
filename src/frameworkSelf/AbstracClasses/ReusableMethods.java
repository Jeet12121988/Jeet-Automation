package frameworkSelf.AbstracClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	WebDriver driver;
	
	public ReusableMethods(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void waitForElementToVisible(By FindBy) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FindBy));
		
	}
	
	
	public void  waitForElementToBeInvisible(By FindBy) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(FindBy));
		
	}
	
	
}
