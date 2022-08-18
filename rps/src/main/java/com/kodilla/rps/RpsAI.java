package com.kodilla.rps;

import java.util.Random;

class RpsAI {
    public static RpsSelection getComputerSelection() {
        Random random = new Random();
        int n = random.nextInt( 100);
        if (n < 33)
            return RpsSelection.ROCK;
        else if (n < 66)
            return RpsSelection.PAPER;
        else
            return RpsSelection.SCISSORS;

    }

    public static RpsWinner getWinner(RpsSelection userSelection, RpsSelection computerSelection) {
        if(userSelection == RpsSelection.ROCK) {
            if(computerSelection == RpsSelection.ROCK)
                return RpsWinner.DRAW;
            else if (computerSelection == RpsSelection.PAPER)
                return RpsWinner.COMPUTER;
            else
                return RpsWinner.HUMAN;


        } else if (userSelection == RpsSelection.SCISSORS) {
            if (computerSelection == RpsSelection.SCISSORS)
                return RpsWinner.DRAW;
            else if (computerSelection == RpsSelection.ROCK)
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
