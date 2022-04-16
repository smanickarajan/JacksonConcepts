package JacksonAnnotationExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Employee;


public class JacksonNonDefault {

	public static void main(String[] args) throws JsonProcessingException {
		Employee emp=new Employee();
		emp.setName("Manick");
		emp.setMarried(true);
		emp.setMobnos("123456");
		ObjectMapper objmap=new ObjectMapper();
		String json=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		System.out.println(json);
		

	}

}
