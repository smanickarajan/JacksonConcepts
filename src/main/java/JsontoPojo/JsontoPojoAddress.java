package JsontoPojo;

import java.io.File;
import java.io.IOException;


import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address;

public class JsontoPojoAddress {

	public static void main(String[] args) throws IOException {
		ObjectMapper objmap = new ObjectMapper();
		Address add = objmap.readValue(new File("..\\JacksonConcepts\\src\\test\\resources\\payloads\\address.json"),
				Address.class);
		System.out.println(add.getCity());
		add.setCity("Bengaluru");
		System.out.println(add.getCity());
		System.out.println(add.getCountry());
		String updateJson= objmap.writerWithDefaultPrettyPrinter().writeValueAsString(add);
		System.out.println(updateJson);
	}

}
