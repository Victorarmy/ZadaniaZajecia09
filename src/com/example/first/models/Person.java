package com.example.first.models;

import com.example.first.exceptions.IncorrectAgeException;
import com.example.first.exceptions.NameUndefinedException;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws IncorrectAgeException, NameUndefinedException {
        if (firstName.length() < 2 || lastName.length() < 2 || firstName == null || lastName == null) {
            throw new NameUndefinedException();
        }
        if (age < 1) {
            throw new IncorrectAgeException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
