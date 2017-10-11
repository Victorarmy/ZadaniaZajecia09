package com.example.first.controllers;

import com.example.first.exceptions.IncorrectAgeException;
import com.example.first.exceptions.NameUndefinedException;
import com.example.first.models.Person;

import java.util.Scanner;

public class ControlLoop {

    private Scanner scanner;

    public ControlLoop() {
        this.scanner = new Scanner(System.in);
    }

    public Person getUserInputs() throws IncorrectAgeException, NameUndefinedException {
        System.out.println("Podaj imie");
        String firstName = scanner.nextLine();
        System.out.println("Podaj Nazwisko");
        String lastName = scanner.nextLine();
        if (firstName.length() < 2 || lastName.length() < 2 || firstName == null || lastName == null) {
            throw new NameUndefinedException();
        }
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 1) {
            throw new IncorrectAgeException();
        }
        System.out.println("Podaj pesel");
        String pesel = scanner.nextLine();
        scanner.close();
        return new Person(firstName, lastName, age, pesel);
    }

}
