package com.cegeka.okr2.repository;

import com.cegeka.okr2.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository extends MongoRepository<Person, String> {
}
