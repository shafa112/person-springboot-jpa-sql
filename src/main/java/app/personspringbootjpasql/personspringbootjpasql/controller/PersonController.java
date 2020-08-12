package app.personspringbootjpasql.personspringbootjpasql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.personspringbootjpasql.personspringbootjpasql.model.Person;
import app.personspringbootjpasql.personspringbootjpasql.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/id/{id}")
	public Person getPerson(@PathVariable int id) {
		System.out.println("In get person id:"+id);
		return service.getPerson(id);
	}
	
	@GetMapping("/name/{name}")
	public Person getPerson(@PathVariable String name) {
		return service.getPersonByName(name);
	}
	
	@GetMapping("/all")
	public List<Person> getAll() {
		return service.getAllPerson();
	}
	
	@PostMapping("/insert")
	public Person insert(@RequestBody Person person) {
		return service.insert(person);
	}
	
	@PutMapping("/update")
	public Person update(@RequestBody Person person) {
		return service.update(person);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> delete(@RequestBody Person person) {
		service.delete(person.getId());
		return ResponseEntity.ok().build();
	}
}
