package section17udemy;

import org.testng.annotations.Test;

public class ThisKeyWord {

	

	@Test
	public void tc1() {
	
//	String text=windowHandles();
//	System.out.println(text);
		  int[] n={12,24,2,89,34,45};   
	
		VariousMethods vs=new VariousMethods("Fly kite in sky",n);
		System.out.println(vs.reverseStringByWords());;
		
	    vs.stringReverse();
		
		//VariousIntegerMethods vs1=new VariousIntegerMethods();
		 
		
		vs.largestNumber();
		
	


	}
}
