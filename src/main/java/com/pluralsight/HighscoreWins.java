package com.pluralsight;

import java.util.Scanner;

public class HighscoreWins {

    public static void main(String[] args) {

        //Teams

        Scanner scanner = new Scanner(System.in);

        System.out.println("Who is the home team?");
        String hometeam = scanner.nextLine();

        System.out.println("Who is the away team?");
        String awayteam = scanner.nextLine();

        //Scores

        System.out.println("What is the score of the home team?");
        int hometeamscore = scanner.nextInt();

        System.out.println("What is the score of the away team?");
        int awayteamscore = scanner.nextInt();

        //Team and Scores

        String score = hometeam + ":" + awayteam + "|" + hometeamscore + ":" + awayteamscore;
        System.out.println(score);
        if(hometeamscore > awayteamscore) {
            System.out.println("Winner:" + " " + hometeam);
        }
        else if(hometeamscore < awayteamscore) {
            System.out.println("Winner:" + " " + awayteam);
        }
        else {
            System.out.println("The game was tied!");
        }


    }
}
