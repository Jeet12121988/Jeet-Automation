package interViewPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Interview {
	
	@Test
	public void factorial() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int a=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=a;i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println("Factorial of your number is-"+fact);
	}
	
	
public void stringReverse() {
		
		System.err.println("Factorial code will take place here");
	}


}
