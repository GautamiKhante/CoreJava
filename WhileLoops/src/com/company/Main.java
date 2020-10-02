package com.company;

public class Main {

    public static void main(String[] args) {

        int number =4;
        int finishNumber= 200;
        int flag =0;
        while(number <= finishNumber){
            number++;
            if(!(isEvenNumber(number))) {
                continue;
            }
            System.out.println("Even number " + number);
            flag ++;
            if(flag == 5){
                System.out.println("braking the loop");
                break;
            }


        }
        System.out.println(flag);
    }

    public static Boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }


}
