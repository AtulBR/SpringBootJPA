package com.cts.boot.Service;

import com.cts.boot.Exception.ResourceNotFoundException;
import com.cts.boot.Model.Person;
import com.cts.boot.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepo personRepo;

    @Override
    public Person createPerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        Optional<Person> persondb = this.personRepo.findById(person.getId());
        if (persondb.isPresent()) {
            Person updatePerson = persondb.get();
            updatePerson.setId(person.getId());
            updatePerson.setName(person.getName());
            updatePerson.setCountry(person.getCountry());
            updatePerson.setPhoneNo(person.getPhoneNo());
            personRepo.save(updatePerson);
            return updatePerson;
        } else {
            throw new ResourceNotFoundException("Record not found with id " + person.getId());
        }
    }

    @Override
    public List<Person> getAllPerson() {
        List<Person> persons = new ArrayList<Person>();
        personRepo.findAll().forEach(persons::add);
        return persons;
    }

    @Override
    public Person getPersonById(int id) {
        Optional<Person> personDb = this.personRepo.findById(id);
        if(personDb.isPresent()) {
            return personDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id " + id);
        }
    }

    @Override
    public void deletePerson(int id) {
        Optional<Person> personDb = this.personRepo.findById(id);
        if(personDb.isPresent()) {
            this.personRepo.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Record not found with id " + id);
        }
    }
}