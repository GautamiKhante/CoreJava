package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(1000, 4));

        for(int i = 2; i <=8; i++ ){
            System.out.println("10000 at "+ i + " percent interest " + String.format("%2f" ,calculateInterest(10000, i)));
        }

        System.out.println("*******************************");

        for(int i = 8; i >=2; i-- ){
            System.out.println("10000 at "+ i + " percent interest " + String.format("%2f" ,calculateInterest(10000, i)));
        }

        System.out.println("*******************************");
        int count = 0;
        for(int i = 2; i <=100 ; i ++){

            if(isPrime(i)){
                 count++;
                System.out.println(i+ ": is prime number");
                if(count == 10 ){
                    System.out.println("Exiting the loop...!");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));

    }

    public static boolean isPrime(int number){
        if(number == 1){
            return false;
        }
        for(int i = 2 ; i <= number/i; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
