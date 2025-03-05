package interViewPractice;

import java.util.Arrays;

public class AddingTwoArrays {

	public static void main(String[] args) {
	
		int[] a= {1,23,4,5,6};
		int[] b= {1,23,45,5,6,8};
		
		int a1=a.length;
		int b1=b.length;
		
		int c1=a1+b1;
		
		int[] c=new int[c1];
		
		
		for(int i=0;i<a.length;i++) {
			
			c[i]=a[i];
			
		}
		
		for(int i=0;i<b.length;i++) {
			
			c[a1+i]=b[i];
			
			
		}
		
		System.out.println(Arrays.toString(c));
	}
}
