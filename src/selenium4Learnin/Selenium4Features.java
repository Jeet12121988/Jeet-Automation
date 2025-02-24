package selenium4Learnin;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Selenium4Features {

	
	@Test
	public void selenium4Features() throws IOException {
		
		//Selenium 4 Comes up with different types of latest featues called reletive xpath
		//we can have several methods like above below etc
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement NameEditBox=driver.findElement(By.cssSelector("[name='name']"));
	
		String text=driver.findElement(with(By.tagName("label")).above(NameEditBox)).getText();
		System.out.println(text);
		
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();

		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();



		WebElement rdb = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
	//	String childWindow1=it.next();
		
		
		
		driver.get("https://rahulshettyacademy.com/");
		
		String link=driver.findElements(By.cssSelector("a[ href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(link);
		
		driver.switchTo().window(parentWindow);
		NameEditBox.sendKeys(link);
		
		
		//In Selenium 4 We can take the ScreenShots of a perticuler Web Element
		File source=NameEditBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("logo.png"));
	    
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.partialLinkText("Cypress")).click();
		driver.switchTo().window(parentWindow);
		
		//Take Height and Width Of a WebElement
		System.out.println(NameEditBox.getRect().getDimension().getHeight());
		System.out.println(NameEditBox.getRect().getDimension().getWidth());

		
	}


}
