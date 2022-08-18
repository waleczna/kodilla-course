package com.kodilla.rps;

import java.util.Random;

import static com.kodilla.rps.RpsSelection.ROCK;

class RpsAI {
    public static RpsSelection getComputerSelection(RpsSelection userSelection) { //change (first set parameter in 14line  RPSGame)
        Random random = new Random();
        int n = random.nextInt( 100);
        if (n < 80) //change: if the computer is to win (80%)
            if (userSelection == ROCK) //if the player's choice is rock
                return RpsSelection.PAPER; //return the paper for the computer to win
            else if (userSelection == RpsSelection.SCISSORS) //otherwise, if scissors are the choice
                return ROCK; //we have to return rock so that the computer will win
            else //otherwise - if the player chooses the paper
                return RpsSelection.SCISSORS; //return scissors for the computer to win


            //return RpsSelection.ROCK; (OUT OF THE CODE UNDER CHEAT CONDITIONS)
        else if (n < 90) //change: we create conditions for people to win (only 10%)
            return userSelection; //change: return - what user selected
        else
            //return RpsSelection.SCISSORS; (AS ABOVE)
            if (userSelection == ROCK) //if the player's choice is rock
                return RpsSelection.SCISSORS; //return scissors for the man to win
            else if (userSelection == RpsSelection.SCISSORS) //if player's selection is scissors
                return RpsSelection.PAPER; //return paper for the man to win
            else //otherwise, if player's choice is paper
                return RpsSelection.ROCK; //return rock for the man to win
        //AND NOW THE PROGRAM IS CHEATING


    }

    public static RpsWinner getWinner(RpsSelection userSelection, RpsSelection computerSelection) {
        if(userSelection == ROCK) { //in 10% the program will allow the man to draw
            if(computerSelection == ROCK)
                return RpsWinner.DRAW;
            else if (computerSelection == RpsSelection.PAPER)
                return RpsWinner.COMPUTER;
            else
                return RpsWinner.HUMAN;


        } else if (userSelection == RpsSelection.SCISSORS) {
            if (computerSelection == RpsSelection.SCISSORS)
                return RpsWinner.DRAW;
            else if (computerSelection == ROCK)
                return RpsWinner.COMPUTER;
            else
                return RpsWinner.HUMAN;


        } else {
            if (computerSelection == RpsSelection.PAPER)
                return RpsWinner.DRAW;
            else if (computerSelection == RpsSelection.SCISSORS)
                return RpsWinner.COMPUTER;
            else
                return RpsWinner.HUMAN;

        }
    }
}
