package frameworkSelf;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.CharSetUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
   
	public WebDriver driver;

	
	


	@BeforeTest
	public LoginPage BrowserInitialization() {
	
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage lp=new LoginPage(driver);
		return lp;
				
		
	}
	
	public List<HashMap<String, String>> readDataFromJSON() throws IOException {
		
		String readJsonFile=FileUtils.readFileToString(new File("E:\\eclipse-workspace\\uacc\\FrameWorkDesign\\src\\frameworkSelf\\data.json"));
		
		ObjectMapper ob=new ObjectMapper();
		List<HashMap<String,String>> data=ob.readValue(readJsonFile, 
				new TypeReference <List<HashMap<String,String>>>(){});
		
		return data;


	}

}
