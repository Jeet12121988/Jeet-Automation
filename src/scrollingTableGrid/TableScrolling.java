package scrollingTableGrid;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableScrolling {
	WebDriver driver;
	int sum=0;
	
	@Test
	public void scrolling() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//First if you want to scroll in Window than use window.scroll(0,500)
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,700)");
		
		Thread.sleep(3000);
		//If you want to scroll in a table than us document.queryselector(webElement).scrollTop=5000
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		for(int i=0;i<values.size();i++) {
			
        int j=Integer.parseInt(values.get(i).getText());
        
       
			sum=sum+j;
		}
		
		 System.out.println(sum);
		 
        int TotalAmount=Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
        
        Assert.assertEquals(sum, TotalAmount);
		
		 
		 
	}

}
