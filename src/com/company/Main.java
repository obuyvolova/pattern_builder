package com.company;

public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Wolf")
                .setAge(31)
                .setAddress("Sydney")
                .build();
        System.out.println(mom);
        Person son = mom.newChildBuilder()
                .setName("Anton")
                .build();
        System.out.println(mom + " has son , " + son);

        mom.happyBirthday();
        son.happyBirthday();
        System.out.println(mom);
        System.out.println(son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

