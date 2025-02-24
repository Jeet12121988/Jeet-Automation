package interViewPractice;

public class TestSuperHelper extends TestSuperClass3 {
	int a,b;
	
	
	public TestSuperHelper(int a, int b,int integer) {
		super(integer);
		this.a=a;
		this.b=b;
		
	}
	
	
    


	public int add() {
		
		int c=a+b;
		return c;
		
	}
	
	public int mutilply() {
		
		
		int c=a*b;
		return c;
	}
	
	public int minus() {
		
		
		int c=a-b;
		return c;
	}


}
