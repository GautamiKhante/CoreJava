package com.company;

public class Main {

    private static final String INVALID_ERROR_MESSAGE = "Invalid Value";

    public static void main(String[] args) {


        calculateFeetAndInchesToCentimeters(7, 10);
        System.out.println( getDurationString(70, 45));
        System.out.println(getDurString(445));

    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) && ((inches < 0) && (inches > 12))) {
            System.out.println("invalid number of feet or  inches");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(centimeters);
        return centimeters;

    }
    public static double calculateFeetAndInchesToCentimeters(int inches){
        if (inches<0){
            System.out.println("invalid number of inches");
            return -1;
        }
        double feet = (int)inches /12 ;
        double remainingInches = (int) inches%12;
        System.out.println("remaining feet and inches : " + feet + " inches "+ inches);
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);

    }

    public static String getDurationString(long minutes, long seconds){
        if ((minutes<0 ) || ((seconds <=0) || (seconds > 59))){
            return INVALID_ERROR_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes% 60;
        String hoursString =   hours + "h";
        if (hours < 10 ){
            hoursString = "0" + hoursString;
        }
        return hoursString + " " +  minutes + " m " + seconds + " s";

    }
    public static String getDurString(long seconds){
         if ( seconds < 0 ){
             return INVALID_ERROR_MESSAGE;
         }
         long  minutes = seconds / 60;
         long remainingSeconds = seconds % 60;
         return getDurationString(minutes, remainingSeconds);

    }

}
