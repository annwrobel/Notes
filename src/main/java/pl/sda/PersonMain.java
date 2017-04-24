package pl.sda;

import java.text.Collator;
import java.util.*;

/**
 * Created by jakubwrabel on 12.01.2017.
 */
public class PersonMain {
    public static void main(String[] args) throws InterruptedException {

//        String s1 = "";
//        s1.compareTo("A");
//        Integer.compare(1, 2);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Piotr", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Łukasz", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));

//        Collections.sort(personList, new PersonBirthYearComparator());
        Collections.sort(personList, (Person x, Person y) -> x.getFirstName().compareTo(y.getLastName()));


//        Comparator<Person> nameComparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person person1, Person person2) {
//                return person1.getFirstName().compareTo(person2.getFirstName());
//            }
//        };
//
//        Collections.sort(personList, nameComparator);
//
//

        Collections.sort(personList, new Comparator<Person>() {
                    @Override
                    public int compare(Person person1, Person person2) {

                        Collator collator = Collator.getInstance(new Locale("pl", "PL"));

                        int lastNameComparingResult = collator.compare(person1.getLastName(), person2.getLastName());

                        if (lastNameComparingResult == 0) {
                            return collator.compare(person1.getFirstName(), person2.getFirstName());
                        } else {
                            return lastNameComparingResult;
                        }
                    }
                }
        );

        for (Person object : personList) {
            System.out.println(object.toComplexString());
        }
        Thread thread1 = new Thread(() -> {

//            synchronized (thread2) {
//                try {
//                    thread2.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });

        Thread thread2 = new Thread(() -> {


            for (int i = 10; i < 20; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            synchronized (thread1) {
                thread1.notify();
            }
        });


        thread1.start();
        synchronized (thread1) {
            thread1.wait();
        }
        thread2.start();

    }
}
