package com.rani.study;

public class Main {

    public static void main(String[] args) {

        displayHighScorePostion("Andy", calculateHighScorePosition(1500));
        displayHighScorePostion("Roger", calculateHighScorePosition(900));
        displayHighScorePostion("Rafael", calculateHighScorePosition(400));
        displayHighScorePostion("Lance", calculateHighScorePosition(50));

    }

    public static void displayHighScorePostion(String name, int position) {

        System.out.println(name + " managed to get into position:" + position + " on high score table ");
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score <= 500 ) {
            position = 2;
        } else if (score >= 100 ) {
            position = 3;
        }
        return position;
    }


}
