package com.company;

public class Main {

    public static void main(String[] args) {

        char charVariable = 'A' ;

        switch (charVariable){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            default:
                System.out.println("Char not found");
        }
    }
}
