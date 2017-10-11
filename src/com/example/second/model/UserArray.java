package com.example.second.model;

import com.example.second.writers.ArrayWriter;

import java.io.IOException;

public class UserArray {

    private double[] userArray;
    private int numbersAdded;

    public UserArray() {
        this.numbersAdded = 0;
    }

    public void createArray(int numbersQty) {
        this.userArray = new double[numbersQty];
    }

    public void addNumber(double userInput) {
        userArray[numbersAdded] = userInput;
        numbersAdded++;
    }

    public String writeToFile() throws IOException {
        return ArrayWriter.writeArrayToFile(userArray);
    }
}
