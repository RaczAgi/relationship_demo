package hu.progmatic.relationship_demo.repo;

import hu.progmatic.relationship_demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{


}
