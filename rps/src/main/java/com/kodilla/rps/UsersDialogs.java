package com.kodilla.rps;

import java.util.Scanner;

class UsersDialogs {
    public static int getNumberOfRounds() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How many rounds do you want to play? (1-5)");
            String ans = scanner.nextLine();
            try {
                int n = Integer.parseInt(ans);
                if (n >= 1 && n <= 5)
                    return n;
                else
                    System.out.println("Wrong number, try again");
            } catch (Exception e) {
                System.out.println("Wrong number, try again");
            }
        }
    }

    public static RpsSelection getUserSelection() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your selection: (R)ock, (S)cissors, (P)aper or (Q)uit");
            String ans = scanner.nextLine().toUpperCase();
            switch (ans) {
                case "R" : return RpsSelection.ROCK;
                case "S" : return RpsSelection.SCISSORS;
                case "P" : return RpsSelection.PAPER;
                case "Q" : return RpsSelection.QUIT;
                default:
                    System.out.println("Wrong selection, try again.");
            }
        }
    }

    public static void showStats(int howManyRounds, int roundNumber, RpsSelection userSelection, RpsSelection computerSelection, RpsWinner winner, int humanScore, int computerScore) {
        System.out.println("Round " + roundNumber + " of " + howManyRounds);
        System.out.println("User selected: " + userSelection);
        System.out.println("AI selected: " + computerSelection);
        System.out.println("Round winner is: " + winner);
        System.out.println("User points: " + humanScore);
        System.out.println("AI points: " + computerScore);
    }

    public static void showFinalStats(int humanScore, int computerScore) {
        if (humanScore > computerScore)
            System.out.println(("User is the FINAL WINNER !!"));
        else if (computerScore > humanScore)
            System.out.println("AI is the FINAL WINNER !!");
        else System.out.println("There is a FINAL DRAW !!");
    }
}
