package com.test.flyway;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.flyway.model.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

@SpringBootTest
class FlywayApplicationTests {

	@Test
	void contextLoads() {
	}

	ObjectMapper objectMapper = new ObjectMapper();

	@Test
	void pojoToJsonString() throws JsonProcessingException {
		Employee employee = new Employee("Mark", "James", 20);

		String json = objectMapper.writeValueAsString(employee);

		System.out.println("JSON VALUE IS : "+json);
	}

	@Test
	void jsonFileToPojo() throws IOException {
		File file = new File("src/TestCase");
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);

		Employee employee = objectMapper.readValue(file, Employee.class);

		System.out.println(employee.getAge());
		System.out.println(employee.getLastName());
		System.out.println("NAME OF THE EMPLOYEE IS  "+employee.getFirstName());
	}
}
