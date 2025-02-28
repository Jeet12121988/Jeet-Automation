package interViewPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Interview {
	
//	@Test
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
	
	@Test
public void stringReverse() {
		
//		Scanner sc1=new Scanner(System.in);
//		System.out.println("Enter your String");
//		
//		String a=sc1.next();
//		System.out.println("your entered String is-"+a);
		
		String a="Hello Java";
		
	    System.out.println(a);
		
		String reverse[]=a.split(" ");
	
		System.out.println(reverse.length);
		
		String wordwise="";
	
		for (int i=0;i<reverse.length;i++) {
			
			String desired="";
			
			for(int j=0;j<reverse[i].length();j++) {
				
				desired=reverse[i].charAt(j)+desired;
				
			}
		
			wordwise=wordwise+" "+desired;
		}
		System.out.println("Reverse of your string is -"+wordwise );
	}


}
