package com.example.second.controlers;

import com.example.second.model.UserArray;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class LoopController {

    private UserArray userArray;

    public LoopController() {
        this.userArray = new UserArray();
    }

    public void start() {
        System.out.println("Ile liczb chcesz wprowadzic? ");
        try (Scanner scanner = new Scanner(System.in)){
            scanner.useLocale(Locale.US);
            int numbersQty = scanner.nextInt();
            userArray.createArray(numbersQty);
            takeNumbersFromUser(numbersQty, scanner);
            String fileName = userArray.writeToFile();
            System.out.println("Zapis do pliku przebiegł pomyślnie. Dane znajdują się w pliku o nazwie: " + fileName);
        } catch (InputMismatchException e) {
            System.err.println("Wprowadzono niepoprawne dane");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
            e.printStackTrace();
        } finally {
            System.out.println("Zakończono działanie programu.");
        }
    }

    private void takeNumbersFromUser(int numbersQty, Scanner scanner) {
        for (int i = 0; i < numbersQty; i++) {
            System.out.println("Wprowadz " + (i + 1) + " liczbę: ");
            userArray.addNumber(scanner.nextDouble());
        }
    }
}
