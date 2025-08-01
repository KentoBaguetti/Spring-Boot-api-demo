package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao  {

    // this arraylist acts as a mock/temp database until a real database is implemented
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName())) ;
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return this.DB;
    }

}
