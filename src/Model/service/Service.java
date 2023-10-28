package Model.service;

import Model.builder.MyPersonBuilder;
import View.Checks.exeptions.NameExeption;
import Model.obj.Gender;
import Model.obj.Person;
import Model.phoneBook.PhoneBook;

import java.time.LocalDate;

public class Service {

    private MyPersonBuilder builder;
    private PhoneBook phoneBook;

    public Service() {
        builder = new MyPersonBuilder();
        phoneBook = new PhoneBook();
    }

    public void addPerson(String familia, String name, String otchestvo, LocalDate bornDate, long phoneNumber, Gender gender) {
        Person person = builder.createPerson(familia, name, otchestvo, bornDate, phoneNumber, gender);
        phoneBook.addPerson(person);
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список людей:\n");
        for(Person person: phoneBook){
            sb.append(person);
            sb.append("\n");
        }
        return sb.toString();
    }
}
