package com.cegeka.okr2.repository;

import com.cegeka.okr2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository extends SimpleMongoRepository<Person, String> {

    @Autowired
    public PersonRepository(MongoOperations mongoOperations) {
        //TODO
        super(null, mongoOperations);
    }
}
