package com.example

import com.example.domain.Person
import com.example.repository.PersonRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import spock.lang.Specification

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

/**
 * Created by kelvin.johnson on 1/28/2016.
 */

@SpringApplicationConfiguration(RecordSortApplication.class)
class PersonRepositorySpec extends Specification {

    @PersistenceContext(unitName = "RecordSortPU")
    private EntityManager entityManager;

    @Autowired
    PersonRepository personRepository;

    def "Check repository save and get methods"()
    {
        given: "A person..."
        def row = new Row(lastName: lastName, firstName: firstName, gender: gender, favoriteColor: favoriteColor, dob: dob)

        Person person = new Person();
        person.setLastName(row.getLastName())
        person.setFirstName(row.getFirstName())
        person.setGender(row.getGender())
        person.setFavoriteColor(row.getFavoriteColor())
        person.setDob(row.getDob())

        when: "I save a person"
        Person savedPerson = personRepository.save(person)

        then: "It will be persisted to the database and can be retrieved."
        Person newPerson = personRepository.findOne(savedPerson.id)
        System.out.println(newPerson)

        where:

        lastName|firstName|gender|favoriteColor|dob
        "Buffet"|"Jimmy"|"M"|"Brown"|"12-27-1970"
        "Bush"|"George"|"M"|"Red"|"04-23-1971"
        "Cartman"|"Eric"|"M"|"Green"|"05-03-1971"
        "Crockett"|"Davey"|"M"|"Yellow"|"07-17-1972"
        "Doe"|"Jane"|"F"|"Orange"|"08-26-1972"
        "Gates"|"Bill"|"M"|"Blue"|"05-07-1973"
        "Jefferson"|"George"|"M"|"Grey"|"12-06-1973"
        "Kong"|"King"|"M"|"Red"|"03-07-1975"
        "Munster"|"Herman"|"M"|"Black"|"10-06-1975"
        "Rockne"|"Knute"|"M"|"Red"|"02-17-1978"
        "Simpson"|"Homer"|"M"|"Yellow"|"01-20-1979"
        "Smith"|"Bob"|"M"|"Blue"|"05-18-1980"
    }
}
