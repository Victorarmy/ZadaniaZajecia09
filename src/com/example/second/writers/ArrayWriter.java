package com.example.second.writers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArrayWriter {

    private static String fileName = "array.txt";

    public static String writeArrayToFile(double[] userArray) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (double number : userArray) {
                bufferedWriter.write(String.valueOf(number));
                bufferedWriter.newLine();
            }
        }
        return fileName;
    }
}
