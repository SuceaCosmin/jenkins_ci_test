package model.builder;

import model.Person;
import model.PersonName;

import java.util.Objects;

public class PersonNameBuilder {

    public PersonName buildPerson(Person person) {

        Objects.requireNonNull(person, "Person cannot be null!");

        return new PersonName(person.getFirstName(),person.getLastName());
    }
}
