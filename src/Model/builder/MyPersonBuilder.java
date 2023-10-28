package Model.builder;

import View.Checks.exeptions.*;
import Model.obj.Gender;
import Model.obj.Person;

import java.time.LocalDate;

public class MyPersonBuilder {

    public Person createPerson(String familia, String name, String otchestvo, LocalDate bornDate, long phoneNumber, Gender gender){
        return new Person(familia, name, otchestvo, bornDate, phoneNumber, gender);
    }

}
