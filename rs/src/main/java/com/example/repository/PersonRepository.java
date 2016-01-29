package com.example.repository;

import com.example.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kelvin.johnson on 1/28/2016.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> getAllByOrderByGenderAscLastNameAsc();
    List<Person> getAllByOrderByDobAsc();
    List<Person> getAllByOrderByLastNameDesc();
}
