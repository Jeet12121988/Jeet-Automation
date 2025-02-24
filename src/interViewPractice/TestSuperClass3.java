package interViewPractice;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSuperClass3 {
	int integer;
	
	public TestSuperClass3(int integer) {
		this.integer=integer;
	}

	public int factorial() {
		
		int fact = 1;
		
		for(int i=1;i<=integer;i++) {
			
			fact=fact*i;
			
		}
		
		return fact;
	}
	
	
	public List<HashMap<String, Integer>> readDataFromJSON() throws IOException {
		
		String readData=FileUtils.readFileToString
		(new File("E:\\eclipse-workspace\\uacc\\FrameWorkDesign\\src\\interViewPractice\\data.json"),StandardCharsets.UTF_8);
		
		ObjectMapper mapper=new ObjectMapper();
		List<HashMap<String,Integer>> data=
				mapper.readValue(readData, new TypeReference<List<HashMap<String,Integer>>>(){});
		
		return data;
		
		
	}
	
	

}
