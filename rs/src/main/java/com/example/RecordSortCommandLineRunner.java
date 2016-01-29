package com.example;

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by kelvin.johnson on 1/28/2016.
 */
@Component
public class RecordSortCommandLineRunner  implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(String[] args) throws Exception {

        Row row = new Row();
        row.setLastName("Johnson");
        row.setFirstName("Kelvin");
        row.setGender("M");
        row.setFavoriteColor("Orange");
        row.setDob("4-10-1976");

        Person person = new Person();
        person.setLastName("Johnson");
        person.setFirstName("Kelvin");
        person.setGender("M");
        person.setFavoriteColor("Orange");
        person.setDob(row.getDob());

        personRepository.save(person);

    }

}
