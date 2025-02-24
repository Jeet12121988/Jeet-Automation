package interViewPractice;

public class SuperKeywordPractice extends SuperKeyWorkPractice2{
	
	String MyName="My Name is Mack and My Age is 47";
	

public SuperKeywordPractice(String MyName ) {
	
	this.MyName=MyName;
}

public void thisPractice1() {
	
	System.out.println(this.MyName);
}




	

	
	
	

	public static void main(String[] args) {
		
		
		SuperKeywordPractice obj=new SuperKeywordPractice("My Name is Jeet");
		obj.thisPractice1();
		
		

	}

}
