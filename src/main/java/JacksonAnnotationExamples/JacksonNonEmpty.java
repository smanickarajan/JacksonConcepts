package JacksonAnnotationExamples;

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Employee3;


public class JacksonNonEmpty {

	public static void main(String[] args) throws JsonProcessingException {
		Employee3 emp=new Employee3();
		emp.setName("Manick");
		emp.setAge(0);
		emp.setMarried(false);
		emp.setMobnos("123456");
		emp.setSkills(new ArrayList<>());
		emp.setMembers(new HashMap<>());
		ObjectMapper objmap=new ObjectMapper();
		String json=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		System.out.println(json);
		

	}

}
