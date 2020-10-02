package com.company;

public class Main {

    public static void main(String[] args) {

        printSquareStar(8);
        printSquareStar(5);

    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // a loop which prints a new line (a row)
            System.out.println();
            System.out.println();
            for (int i = 0; i < number; i++) {
                // a loop which prints * and a space
                for (int j = 0; j < number; j++) {
                    if (i == 0 || (i == number - 1) || j == 0 || (j == number - 1) || (i == j) || ((j + 1) == number - (i + 1) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
