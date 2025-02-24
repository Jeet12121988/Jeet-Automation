package interViewPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	
	String tFes;
	@Test
	public void relativeXpath() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.livemint.com/bank-holidays-india/telangana");
		
		//This will give you only one festival
//		WebElement festival=driver.findElement(By.xpath("//div[@class='scrolldata']//td[2][text()='Tuesday']/following-sibling::td"));
//		System.out.println(festival.getText());
		
		
		List<WebElement> festivals=driver.findElements(By.xpath("//div[@class='scrolldata']//td[2][text()='Tuesday']/following-sibling::td"));
		System.out.println(festivals);
		
		for(int i=0;i<festivals.size();i++) {
			tFes=festivals.get(i).getText();
			System.out.println(tFes);
		}
		
		
	}

}
