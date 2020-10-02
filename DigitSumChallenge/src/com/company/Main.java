package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(isPalindrome(121));
        System.out.println(sumFirstAndLastDigit(124));
        System.out.println(evenDigitSum(234567));
        System.out.println(hasSharedDigits(19, 99));
        System.out.println(hasSameLastDigit(22, 32, 11));
        System.out.println(isValid(100));
        System.out.println(getGreatestCommonDivisor(25, 15));
        printFactors(6);
        System.out.println(isPerfectNumber(6));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;

        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int digit;
        int sum = 0;
        int temp = number;

        while (number > 0) {
            digit = number % 10;
            sum = (sum * 10) + digit;
            number = number / 10;
        }
        return temp == sum;
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        int lastDigit = number % 10;
        return firstDigit + lastDigit;

    }

    public static int evenDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;

    }

    public static boolean hasSharedDigits(int first, int second) {

        if (!((first >= 10 && first <= 99) && (second >= 10 && second <= 99))) {
            return false;
        }
        int firstLeft = first / 10;
        int firstRight = first % 10;
        int secondLeft = second / 10;
        int secondRight = second % 10;

        return (firstLeft == secondLeft) || (firstRight == secondRight) ||
                (secondLeft == firstRight) || (secondRight == firstLeft);
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!((first >= 10 && first <= 1000) && (second >= 10 && second <= 1000)
                && (third >= 10 && third <= 1000))) {
            return false;
        }

        int firstRight = first % 10;
        int secondRight = second % 10;
        int thirdRight = third % 10;

        return (firstRight == secondRight) || (firstRight == thirdRight) || (secondRight == thirdRight);
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

    private static int getGreatestCommonDivisor(int number1, int number2) {

        if (number1 < 10 || number2 < 10) {
            return -1;
        }
        int gcd = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum = sum + i;
            if (sum == number) {
                return true;
            }
        }
        return false;
    }
}
