package interViewPractice;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class JavaArrays {
	
	//@Test
	public void sum() {
		
		int[] a= {1,5,6,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		
		//System.out.println(sum);
	}
	
	//@Test
	public void reverse() {
		
		int[] a= {1,5,6,8,9};
		int[] b= {2,3,5,6};
		int c=0;
		for(int i=0;i<a.length;i++) {
			
		
			
			int c1=a[i]+b[i];
			System.out.println(c1);
			
		

		}
		
			}
	
	
	
	////////////////////////*****************************
	//Write a program to find the unique number form the list
	@Test
	public void uniqueNumber() {
		int a[] ={ 4,5,5,5,4,6,6,9,4}; 
		// Print unique number from the list- Amazon  
		//print the string in reverse 
		ArrayList<Integer>ab =new ArrayList<Integer>(); 
		for(int i=0;i<a.length;i++) { 
			int k=0; 
			if(!ab.contains(a[i])) { 
				ab.add(a[i]);
				 System.out.println("The value of a[i]"+a[i]); 
				k++; 
				for(int j=i+1;j<a.length;j++){ 
					
					if(a[i]==a[j]) 
				{
						k++; 
				
				} 
					}
				 System.out.println(a[i]); 
				 System.out.println(k);
				 if(k==1) 
					 
					 System.out.println(a[i]+"is unique number"); 
				 } 
			}
		}
			

}
