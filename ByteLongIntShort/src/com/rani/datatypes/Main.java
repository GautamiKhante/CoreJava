package com.rani.datatypes;

public class Main {

    public static void main(String [] args){

        int myInteger= 100;

        int shortestInt = Integer.MAX_VALUE;
        int longestestInt = Integer.MIN_VALUE;

        System.out.println("minimum integer value"  + shortestInt);
        System.out.println("maximum integer value " + longestestInt);

        byte shortestByte = Byte.MIN_VALUE;
        byte longestByte = Byte.MAX_VALUE;

        System.out.println("minimum byte value" + shortestByte);
        System.out.println("maximum byte value" + longestByte);

        long longestLongValue = Long.MAX_VALUE;
        long shortestLongvalue= Long.MIN_VALUE;

        System.out.println("minimum long value" +longestLongValue);
        System.out.println("maximum long value" + shortestLongvalue);

        short shortestShortValue= Short.MIN_VALUE;
        short longestShortValue = Short.MAX_VALUE;

        System.out.println("minimum short  value" + shortestShortValue);
        System.out.println("maximum short value" + longestShortValue);

        int divideInteger= (longestestInt/2);

        byte divideByte = (byte) (longestByte/2);

        long divideLond = (longestLongValue/2);

        short divideShort = (short) (longestShortValue/2);




        /**
         * minimum integer value2147483647
         * maximum integer value -2147483648
         * minimum byte value-128
         * maximum byte value127
         * minimum long value9223372036854775807
         * maximum long value-9223372036854775808
         * minimum short  value-32768
         * maximum short value32767
         */



    }
}
