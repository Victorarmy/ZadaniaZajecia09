package com.example.first.app;

import com.example.first.controllers.ControlLoop;
import com.example.first.exceptions.IncorrectAgeException;
import com.example.first.exceptions.NameUndefinedException;
import com.example.first.models.Person;

import java.util.InputMismatchException;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", 34, "123412325434");
        System.out.println(person);
        ControlLoop controlLoop = new ControlLoop();
        try {
            System.out.println(controlLoop.getUserInputs());
        } catch (IncorrectAgeException | InputMismatchException e) {
            System.out.println("Niepoprawny wiek");
        } catch (NameUndefinedException e) {
            System.out.println("Niepoprawne imię lub nazwisko");
        }
    }
}
