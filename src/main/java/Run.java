import model.Person;
import model.PersonName;
import model.builder.PersonNameBuilder;

import java.io.IOException;

public class Run {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("O'Donalds");

        PersonNameBuilder builder = new PersonNameBuilder();

        PersonName name = builder.buildPerson(person);

        System.out.println("Hello world by "+name.getFirstName()+" "+name.getLastName()+"...");
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("Failed to read input");
        }
    }

}
