package section17udemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VariousMethods extends VariousIntegerMethods {
	
	String a="";
	public VariousMethods(String a, int[] n) {
		super(n);
		this.a=a;
		
	}



	@Test
	public String windowHandles() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWidow=it.next();
		String Childwindow=it.next();
		
		driver.switchTo().window(Childwindow);
		String text=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		return text;
		
		
		
		
	}
	
	
	
	public String reverseStringByWords() {
		
		String reverse="";
		
		for (int i=0;i<a.length();i++) {
			
			reverse=a.charAt(i)+reverse;
		}
		
		
		//System.out.println(reverse);
		return reverse;
	}
	
	public void stringReverse() {
		
		
		String[] reverse=a.split(" ");
	
		String r=" ";
	
		  String desiredString=" ";
		
		System.out.println(reverse.length);
		
		for (int i=0;i<reverse.length;i++) {
			  String w=" ";
			
             // System.out.println(reverse[i]);
             
              for(int j=0;j<reverse[i].length();j++) {
               
            	  w=reverse[i].charAt(j)+w;
            
            	 
              }
           
              desiredString=desiredString+w;
             
              	 	}
	
		 System.out.println(desiredString);
	
		
	}

}
