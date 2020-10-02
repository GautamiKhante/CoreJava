package com.rani.operators;

public class Main {

    public static void main(String[] args) {
        double myFirstDoule = 20.00;
        double mySecondDouble = 80.00;
        double multiplicationOfDouble = (20.00 + 80.00) * 100;
        System.out.println(multiplicationOfDouble);
        double theRemainder = multiplicationOfDouble % 40.00;
        boolean isNoRemainder = (theRemainder == 0) ? true : false ;
        System.out.println(isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder..! ");
        }

    }
}
