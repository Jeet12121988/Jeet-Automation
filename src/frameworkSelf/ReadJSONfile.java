package frameworkSelf;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONfile {
	
	
	public List<HashMap<String, String>> readJSON() throws IOException {
     
		
     //Reading File to String
     String c= FileUtils.readFileToString(new File("E:\\eclipse-workspace\\uacc\\FrameWorkDesign\\src\\frameworkSelf\\data.json"));
	
     
     //These Strings We need to convert To HashMap
     
     //Jackson Databind
     ObjectMapper ob=new ObjectMapper();
     List<HashMap<String,String>>  data
     
     =ob.readValue(c, new TypeReference<List<HashMap<String,String>>>(){});
     
     return data;
     
    
     
     
	
	}

}
