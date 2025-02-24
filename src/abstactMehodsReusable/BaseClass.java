package abstactMehodsReusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;
import jitendraSahuCompany.pageObjects.LandingPage;

public class BaseClass {
	public WebDriver driver;
	public LandingPage lp;
	public WebDriver invokeBrowser() throws Exception {
		
		
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\eclipse-workspace\\uacc\\FrameWorkDesign\\src\\jitendraSahuCompany\\GlobalProperties\\Global.properties");
		prop.load(fis);
		String browser=prop.getProperty("BrowserName");
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	   // driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    return driver;
	    
		}
		return driver;
	    
	}
	
	public List<HashMap<String,String>> readDataFromJSON(String filePath) throws IOException {
		
		
		//Take JSON file and convert that into on String Variable
		
		String JSONFILE=FileUtils.readFileToString(new File(filePath),StandardCharsets.UTF_8);
		
		//Convert this file to HASHMAP
		ObjectMapper map =new ObjectMapper();
		List<HashMap<String,String>> data=map.readValue(JSONFILE, new TypeReference<List<HashMap<String,String>>>()
				{});
		return data;
		
		
		
	}
	
	
	public String takeScreenShots() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File file=new File("E:\\eclipse-workspace\\uacc\\FrameWorkDesign\\Reports");
		FileUtils.copyFile(source,file);
		return "E:\\eclipse-workspace\\uacc\\FrameWorkDesign\\Reports";
		
	}


	@BeforeMethod(alwaysRun=true)
	public LandingPage launchApplication() throws Exception {
		
		driver=invokeBrowser();
		 lp=new LandingPage(driver);
		lp.goTo();
		return lp;
	}
}

