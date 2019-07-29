package com.ma.streamkafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ma.streamkafka.model.Person;
import com.ma.streamkafka.service.PersonsService;

@RestController
public class PersonController {

	private final PersonsService personService;

	public  PersonController(PersonsService personService) {
		this.personService = personService;
	}
	
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void personlist() {
		Person person = Person.builder().name("Name")
				.gender("M").country("Country").id(2).build();
		
		personService.sendPerson(person);
		
	}
}
