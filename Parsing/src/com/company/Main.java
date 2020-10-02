package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2020";

        int number= Integer.parseInt(numberAsString);

        numberAsString +=1;
        number +=1;

        System.out.println("Number as a string:" + numberAsString);
        System.out.println("Number as an integer:" + number);
    }
}
