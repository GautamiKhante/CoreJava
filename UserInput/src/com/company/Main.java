package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :" );
        String name = scanner.nextLine();
        System.out.println("Your name is :" + name);

        System.out.println("Enter your Birthday:");
        int birthday = scanner.nextInt();
        System.out.println("your birthday is :" + birthday);

    }
}
