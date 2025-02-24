package interViewPractice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDimentionalArrays {
	
	@Test
	public void windowHandle() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		
		String parent=it.next();
		String child= it.next();
		
		driver.switchTo().window(child);
		
		String text=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("username")).sendKeys(text);
	
		
		
		
		
		
	}
	
	
	public static void reverseAstring() {
		
		String A="Hello Java";
		String R="";
		for(int i=0;i<A.length();i++) {
			R=A.charAt(i)+R;
			
		}
		System.out.println("String reverse is-"+R);
	}
	
	public static void sumOfTwoInputs() {
		
		int x,y,sum;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number-");
		x=obj.nextInt();
		
		System.out.println("Enter another number-");
		y=obj.nextInt();
		
		sum=x+y;
		
		System.out.println("sum of two integer is-"+sum);
	}
	
	public static void utpaangString() {
		String actual="abcd";
		String desired="";  //dCbA
		String upperCase = "";
		
		for(int i=0;i<actual.length();i++) {
			
		
			if(i%2==0) {
				
				System.out.println(i);
				
				upperCase=actual.toUpperCase().charAt(i)+upperCase;
				
				
			}else {
			
			upperCase=actual.charAt(i)+upperCase;
			}
			
		}
		//System.out.println(desired);
		System.out.println(upperCase);
		
	}
	
	
	public static void reverseStringNG() {
		
		String  str="Hello Word";

		String str1="";
		String str2=" ";

		String reverse="";
		String reverse1="";
		str1=str.split(" ")[0];
		str2=str.split(" ")[1];

		for(int i=0;i<str1.length();i++){
		      
		     
			reverse=str1.charAt(i)+reverse;

		}


		for(int i=0;i<str2.length();i++){
		      
		     
		      reverse1=str2.charAt(i)+reverse1;

		}

		System.out.println(reverse.concat(reverse1));
		
	}

	public static void main(String[] args) {
		reverseAstring();
		//sumOfTwoInputs();
		//utpaangString();
		
		reverseStringNG();
		
		String ab="This is my Numer:12345 number";
		
		System.out.println(ab.split(":")[1].trim());
		
		int a[][] =new int[2][3];
		int coloumNum = 0;
		
		//Row are squence of columns
		
		a[0][0]=10;
		a[0][1]=0;
		a[0][2]=6;
		a[1][0]=23;
		a[1][1]=5;
		a[1][2]=7;
		int  smallest=a[0][0];
		int  largest=0;
		/*   10 0 6
		 *   23 5 7
		 * 
		 */
	
		
		//System.out.println(a[0][2]);
		System.out.println(a.length);
		for(int i=0;i<2;i++) {
			
			//System.outl.println("i-"+i);
			
			for(int j=i;j<3;j++) {
			//System.out.println("j-"+j);
				if (a[i][j]<smallest) {
					
				smallest=a[i][j];
					coloumNum=j;
				}
				
				
			}
		
		}
		
		
		System.out.println(smallest);
		System.out.println("Coloumn number is-"+coloumNum);
	
               int k=0;
               while(largest<2) {
            	   
            	    largest=a[k][coloumNum];
            	    k++;
               }        
               System.out.println("Largest Number is-"+largest);
	}
}
