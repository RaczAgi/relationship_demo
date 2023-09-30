package hu.progmatic.relationship_demo.service;

import hu.progmatic.relationship_demo.model.Address;
import hu.progmatic.relationship_demo.model.Person;
import hu.progmatic.relationship_demo.repo.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
