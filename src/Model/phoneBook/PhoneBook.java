package Model.phoneBook;

import Model.obj.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PhoneBook implements Iterable<Person> {
    private  long personId;
    private List<Person> personList;


    public PhoneBook(){
        this(new ArrayList<>());
    }

    public PhoneBook(List<Person> list) {
        this.personList = list;
    }

   public boolean addPerson(Person person){
       if(person == null){
           return false;
       }
       else if (!personList.contains(person)) {
           personList.add(person);
           person.setId(personId++);
           return true;
       }
       return false;
   }

    public String info(){
        StringBuilder sb = new StringBuilder();
        sb.append("Телефонная книга: \n");
        sb.append("В телефонной книге находятся - ").append(personList.size()).append(" человек!\n");
        sb.append("Список:\n");
        for(Person person: personList){
            sb.append(person);
            sb.append("\n");
        }
        return sb.toString();
    }

    public Iterator<Person> iterator(){
        return new PhoneBookIterator(personList);
    }


    @Override
    public String toString() {return info();}

}


