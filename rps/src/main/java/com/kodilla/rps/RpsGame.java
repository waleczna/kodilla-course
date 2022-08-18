package com.kodilla.rps;

class RpsGame {
    public void play() {
       int howManyRounds = UsersDialogs.getNumberOfRounds();
       int roundNumber = 1;

       int humanScore = 0;
       int computerScore = 0;
       while (roundNumber <= howManyRounds) {
           RpsSelection userSelection = UsersDialogs.getUserSelection();
           if(userSelection == RpsSelection.QUIT)
               return;
           RpsSelection computerSelection = RpsAI.getComputerSelection(userSelection);
           RpsWinner winner = RpsAI.getWinner(userSelection, computerSelection);

           if (winner == RpsWinner.HUMAN)
               humanScore++;
           else if (winner == RpsWinner.COMPUTER)
               computerScore++;
           else {
               humanScore++;
               computerScore++;
           }
           UsersDialogs.showStats(howManyRounds, roundNumber, userSelection, computerSelection, winner, humanScore, computerScore);

           roundNumber++;
       }
       UsersDialogs.showFinalStats(humanScore, computerScore);
    }
}
