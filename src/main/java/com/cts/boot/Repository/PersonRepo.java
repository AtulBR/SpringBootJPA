package com.cts.boot.Repository;

import com.cts.boot.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Integer> {

}
