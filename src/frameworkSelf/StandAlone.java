package frameworkSelf;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("jeet@1212gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Jeet!1234");
		driver.findElement(By.id("login")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".mb-3")));
		
		List<WebElement> product=driver.findElements(By.cssSelector(".mb-3"));

		WebElement products=product.stream().filter(a->a.findElement(By.cssSelector("b")).getText().equalsIgnoreCase("iphone")).findAny().orElse(null);
		
		String products1=products.findElement(By.cssSelector(".text-muted")).getText();
		System.out.println(products1);
		
		//products.findElement(By.xpath("//div[@class='card-body']//button[2]")).click();
		products.findElement(By.cssSelector(".card-body button:nth-of-type(2)")).click();
		
		driver.findElement(By.xpath("//button[contains(.,'Cart ')]")).click();
		
		List<WebElement> cartProduct=driver.findElements(By.xpath("//div[@class='cartSection']"));
		
		
			
		
		
	}

}
