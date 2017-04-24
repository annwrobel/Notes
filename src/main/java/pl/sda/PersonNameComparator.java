package pl.sda;

import java.util.Comparator;

/**
 * Created by jakubwrabel on 12.01.2017.
 */
public class PersonNameComparator implements

Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getFirstName().compareTo(person2.getFirstName());
    }

}
