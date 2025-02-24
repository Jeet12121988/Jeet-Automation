package interViewPractice;

import java.util.Scanner;

public class JavaScanner {
	
	
	public static void reverse() {
		
		String reverse="";
		String a="Hello Java";
		
		for(int i=0;i<a.length();i++) {
			reverse=a.charAt(i)+reverse;
			
		}
		
		System.out.println(reverse);
	}
	
	public static void factorial() {
		int x,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you Number-");
		x=sc.nextInt();
		
		
		//*******************
		for(int i=1;i<=x;i++) {
			
			f=f*i;
		}
		System.out.println("Factoral value of "+x+"is-"+f);
	}


	public static void main(String[] args) {
		//factorial();
		reverse();

	}

}
