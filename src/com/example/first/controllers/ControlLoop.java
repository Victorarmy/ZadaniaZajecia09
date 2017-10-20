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
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj pesel");
        String pesel = scanner.nextLine();
        scanner.close();
        Person person = new Person(firstName, lastName, age, pesel);
        return person;
    }

}
