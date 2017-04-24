package pl.sda;

/**
 * Created by jakubwrabel on 12.01.2017.
 */
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return firstName
                + ", " + lastName
                + ", " + birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (birthYear != person.birthYear) {
            return false;
        }

//        if(firstName != null){
//            if(!firstName.equals(person.firstName)){
//                return false;
//            }
//        } else {
//            if( person.firstName != null){
//                return false;
//            }
//        }

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }


    @Override
    public int compareTo(Person person) {
        if (birthYear > person.birthYear) {
            return 1;
        } else if (birthYear == person.birthYear) {
            return 0;
        }
        return -1;
    }

    public String toComplexString() {
        return "Osoba" + System.lineSeparator()
                + "\tImię: " + firstName + System.lineSeparator()
                + "\tNazwisko: " + lastName + System.lineSeparator()
                + "\tRok urodzenia: " + birthYear;
    }
}
