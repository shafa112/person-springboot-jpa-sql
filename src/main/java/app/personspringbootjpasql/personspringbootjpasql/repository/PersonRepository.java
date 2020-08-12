package app.personspringbootjpasql.personspringbootjpasql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.personspringbootjpasql.personspringbootjpasql.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	Person findByName(String name);
}
