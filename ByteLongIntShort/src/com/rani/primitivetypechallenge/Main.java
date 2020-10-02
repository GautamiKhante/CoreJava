package com.rani.primitivetypechallenge;

public class Main {

    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 10;
        int myInt = 100;

        long longTotal = 50000L + 10L *(myByte+ myShort+ myInt);
        System.out.println(longTotal);

        short shortTotal = (short) (50000L + 10L *(myByte+ myShort+ myInt));
        System.out.println(shortTotal);


    }
}
