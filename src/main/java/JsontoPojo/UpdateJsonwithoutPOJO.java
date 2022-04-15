package JsontoPojo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address;

public class UpdateJsonwithoutPOJO {

	public static void main(String[] args) throws IOException {
		ObjectMapper objmap = new ObjectMapper();
	Map<String, Object> add = objmap.readValue(new File("..\\JacksonConcepts\\src\\test\\resources\\payloads\\address.json"),
				new TypeReference<Map<String,Object>>() {
				});
		System.out.println(add.get("city"));
		add.put("city", "Delhi");
		add.put("town", "abc");//Dynamically we can add or remove fields
		add.remove("street");
		
		String updateJson= objmap.writerWithDefaultPrettyPrinter().writeValueAsString(add);
		System.out.println(updateJson);
	}

}
