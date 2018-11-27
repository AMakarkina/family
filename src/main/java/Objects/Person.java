package Objects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Person implements Comparable<Person>{
    private String firstName;
    private String secondName;
    private LocalDate dateOfBirthday;
    private LocalDate dateOfDeath;
    private Person father;
    private Person mother;
    private List<Person> childs;

    public Person() {
        this.firstName = null;
        this.secondName = null;
        this.dateOfBirthday = null;
        this.dateOfDeath = null;
    }

    public Person(String firstName, String secondName, LocalDate dateOfBirthday, LocalDate dateOfDeath) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirthday = dateOfBirthday;
        this.dateOfDeath = dateOfDeath;
    }

    public Person(String firstName, String secondName, LocalDate dateOfBirthday) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    /* Used when deserializing setDateOfBirthday. */
    public void setDateOfBirthday(String dateOfBirthday) {
        setDateOfBirthday(LocalDate.parse(dateOfBirthday, DateTimeFormatter.ISO_LOCAL_DATE));
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public List<Person> getChilds() {
        return childs;
    }

    public void setChilds(List<Person> childs) {
        this.childs = childs;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Objects.Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return this.getDateOfBirthday().compareTo(anotherPerson.getDateOfBirthday());
    }
}
