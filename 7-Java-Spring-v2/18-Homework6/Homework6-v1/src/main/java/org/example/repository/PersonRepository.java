package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
