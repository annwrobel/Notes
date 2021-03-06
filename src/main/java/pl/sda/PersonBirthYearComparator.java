package pl.sda;

import java.util.Comparator;

/**
 * Created by jakubwrabel on 12.01.2017.
 */
public class PersonBirthYearComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
//        return Integer.compare(person1.getBirthYear(), person2.getBirthYear());
        if (person1.getBirthYear() > person2.getBirthYear()) {
            return 1;
        } else if (person1.getBirthYear() == person2.getBirthYear()) {
            return 0;
        }
        return -1;
    }
}
