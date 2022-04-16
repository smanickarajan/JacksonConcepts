package JacksonAnnotationExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Employee2;


public class JacksonNonNull {

	public static void main(String[] args) throws JsonProcessingException {
		Employee2 emp=new Employee2();
		emp.setName("Manick");
		emp.setAge(0);
		emp.setMarried(false);
		emp.setMobnos("123456");
		ObjectMapper objmap=new ObjectMapper();
		String json=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		System.out.println(json);
		

	}

}
