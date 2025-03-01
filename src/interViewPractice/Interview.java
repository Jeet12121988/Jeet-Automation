package interViewPractice;

import java.util.ArrayList;
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
	
	//@Test
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

	
	//////////////////////////////////////
	
   // @Test
	public void findSecondLargestElement() {
		
		//Find the second largest number from an array
		
		int a[]= {251,6,65,888,58,356,18};
		
		int largest=1;
		int secondLargest=1;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>largest) {
				
				largest=a[i];
				
			}
		
		}
	
		 for(int j=0;j<a.length;j++) {
				
				if(a[j]>secondLargest && a[j]<largest) {
					
					secondLargest=a[j];
					
				}
			
			
		}
		
		System.out.println("Your largest number is-"+largest);
		
		System.out.println("Your Second largest number is-"+secondLargest);
		
		
		
		
		
		
		
	}


   // @Test
    public void findSecondSmallestElement() {
    	
		//Find the second smallest number from an array
		
		int a[]= {1,45,65,13,4,11,2,1};
		
		int smallest=a.length;
		int Secondsmallest=a.length;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<smallest) {
				
				smallest=a[i];
			}
			
		
		}
		for(int j=0;j<a.length;j++) {
			
			if(a[j]<Secondsmallest && a[j]>smallest) {
				
				Secondsmallest=a[j];
			}
		///////
		
		
			
			
		}
	System.out.println("Your smallest number is-"+smallest);
	System.out.println("Your Second smallest number is-"+Secondsmallest);
	
	
}


    //@Test
    public void findUniqueNumbersFromAnArray() {
    	
    	int a[]= {2,5,6,6,5,2,1,4,3,4,4,3};
    	int uniqueNumber = 0;
    	
    	ArrayList<Integer> ab=new ArrayList<Integer>();
    	
    	for(int i=0;i<a.length;i++) {
    		
    		int k=0;
    		
    		
    		if(!ab.contains(a[i])) {
    			
    			ab.add(a[i]);
    			k++;
    			for (int j=i+1;j<a.length;j++) {
        			
        			if(a[i]==a[j]) {
        				
        				k++;
        				
        			}
                     
                      
        		}
    			 if(k==1) 
               	  
               	  uniqueNumber=a[i];
    		}
    		
    		

    	}
    	
    	System.out.println("Your arrayList is -"+ab);
    	System.out.println("Your Unique Number is -"+uniqueNumber);
    	
    }


    @Test
    public void findDoubleNumbersInArray() {
    	
    	
    	int[] a= {1,2,2,5,6,7,8,9,5};
    	
    	ArrayList<Integer> ab=new ArrayList<Integer>();
    	
    	for(int i=0;i<a.length;i++) {
    		
    		int k=0;
    		if(!ab.contains(a[i])) {
    			
    			ab.add(a[i]);
    			
    			k++;
    			
    		
    			
    			for(int j=i+1;j<a.length;j++) {
    				
    				if(a[i]==a[j]) {
    					
    					k++;
    					
    				}
    				
    				
    				
    			}
    			
    			if(k==2) {
    			System.out.println("Element- "+a[i]+"-came"+k+"-times");
    			}
    		}
    		
    		
    	}
    	
    	System.out.println(ab);
    }

}