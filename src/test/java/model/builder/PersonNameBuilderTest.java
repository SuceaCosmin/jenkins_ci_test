package model.builder;

import model.Person;
import model.PersonName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonNameBuilderTest {


    @Test
    public void shouldThrowException(){

        PersonNameBuilder builder= new PersonNameBuilder();
        Assertions.assertThrows(NullPointerException.class,()->builder.buildPerson(null));

    }

    @Test
    public void ShouldBuildName(){

        Person person= new Person();
        person.setLastName("Jake");
        person.setFirstName("Mike");

        PersonNameBuilder builder= new PersonNameBuilder();

        PersonName name = builder.buildPerson(person);

        Assertions.assertEquals(person.getFirstName(),name.getFirstName());
        Assertions.assertEquals(person.getLastName(),name.getLastName());
    }
}