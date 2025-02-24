package section17udemy;

public class VariousIntegerMethods {
	
	int a[];
	
	public VariousIntegerMethods(int[] n) {
		
		this.a=n;
	}
	
	public void largestNumber() {
		
	   int largest=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>largest) {
				
	         	largest=a[i];
			}
			
			
		}
		
		System.out.println(largest);
	}

}
