package com.example.Angular;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value="/persons")
	public List<Person> getPersons() {
		return Arrays.asList(new Person("id1","abc"),new Person("id2","xyz"));
	}
}
