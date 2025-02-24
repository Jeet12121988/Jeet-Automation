package frameWork;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadDataFromJSON {
	
	public List<HashMap<String,String>> readDataFromJSON() throws IOException {
		
		
		//Take JSON file and convert that into on String Variable
		
		String JSONFILE=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\jitendraSahuCompany\\DataFiles\\Data.Json")
				,StandardCharsets.UTF_8);
		
		//Convert this file to HASHMAP
		ObjectMapper map =new ObjectMapper();
		List<HashMap<String,String>> data=map.readValue(JSONFILE, new TypeReference<List<HashMap<String,String>>>()
				{});
		return data;
		
		
		
	}

}
