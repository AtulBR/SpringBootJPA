package com.cts.boot.Service;

import com.cts.boot.Model.Person;

import java.util.List;

public interface PersonService {

    Person createPerson(Person person);

    Person updatePerson(Person person);

    List<Person> getAllPerson();

    Person getPersonById(int id);

    void deletePerson(int id);
}
