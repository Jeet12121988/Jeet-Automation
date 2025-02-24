package interViewPractice;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSuper1 {
	
  


	@Test(dataProvider = "giveData")
	public void integerActions(HashMap<String,Integer>  input) {
		TestSuperHelper obj=new TestSuperHelper(input.get("a1"),input.get("b1"),input.get("c1"));
	
		int a=obj.add();
		int b=obj.mutilply();
		int c=obj.minus();
		int d=obj.factorial();
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	
}
    
    
    @DataProvider
    public Object[][] giveData() throws IOException {
    	
    	
    	
//    	HashMap<String,Integer> map=new HashMap<String,Integer>();
//    	map.put("a1", 5);
//    	map.put("b1", 4);
//    	map.put("c1", 5);
//    	
//    	HashMap<String,Integer> map1=new HashMap<String,Integer>();
//    	map1.put("a1", 4);
//    	map1.put("b1", 3);
//    	map1.put("c1", 4);
//    	
    	TestSuperClass3 t=new TestSuperClass3(0);
    
    	
    	List<HashMap<String, Integer>> data=	t.readDataFromJSON(); ;
    	
    	return new Object[][] {{data.get(0)},{data.get(1)}};
    	
    }
}
