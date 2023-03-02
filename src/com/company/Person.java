package com.company;

public class Person {
    private final String name;
    private final String surname;
    private int age = -1;
    private String city = " ";


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() {
        return !city.equals(" ");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        city = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age = age + 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAge(0).setAddress(city);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + (age == -1 ? "" : age) + " " + city;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + city.hashCode() + (age == -1 ? 0 : age);
    }
}
