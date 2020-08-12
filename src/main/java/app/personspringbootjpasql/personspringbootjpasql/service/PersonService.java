package app.personspringbootjpasql.personspringbootjpasql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.personspringbootjpasql.personspringbootjpasql.model.Person;
import app.personspringbootjpasql.personspringbootjpasql.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public Person getPerson(int id) {
		System.out.println("in service");
		return personRepository.findById(id).get();
	}
	
	public Person getPersonByName(String name) {
		return personRepository.findByName(name);
	}
	
	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	public Person insert(Person person) {
		return personRepository.save(person);
	}

	public Person update(Person person) {
		return personRepository.save(person);
	}
	
	public void delete(Integer id) {
		personRepository.deleteById(id);
	}
}
