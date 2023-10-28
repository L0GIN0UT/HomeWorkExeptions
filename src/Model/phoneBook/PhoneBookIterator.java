package Model.phoneBook;

import Model.obj.Person;

import java.util.Iterator;
import java.util.List;

public class PhoneBookIterator implements Iterator<Person> {
    private int index;
    private List<Person> humanList;

    public PhoneBookIterator(List<Person> humanList) {
        this.humanList = humanList;
    }

    public boolean hasNext() {
        return humanList.size() > index;
    }

    public Person next() {
        return humanList.get(index++);
    }
}


