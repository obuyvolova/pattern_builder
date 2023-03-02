package com.company;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = -1;
    protected String city = " ";

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalStateException {
        if (age >= 0 && age < 100) {
            this.age = age;
            return this;
        } else {
            throw new IllegalStateException("Incorrect age!");
        }
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;

    }

    public Person build() throws IllegalStateException {
        if (!(name == null) && !(surname == null)) {
            Person person = new Person(name, surname, age);
            person.setAddress(city);
            return person;
        } else {
            throw new IllegalStateException("Fill in the \"name\" and \"surname\" fields!");
        }
    }
}

