import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) {
            return true;
        }
        if (p == null || getClass() != p.getClass()) {
            return false;
        }
        Person person = (Person) p;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender;


    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}
