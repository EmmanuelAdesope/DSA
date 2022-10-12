package com.Conditionals;

import java.util.Scanner;

public class Gambler {
    public static void main(String[] args) {
        // Run T experiments that start with $stake
        // and terminate on 0$ or $goal.


        // Creates a scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the $amount the Gambler wishes to stake");
        int stake = input.nextInt();

        System.out.println("Enter the goal, the amount the Gambler wishes to win");
        int goal = input.nextInt();

        System.out.println("Enter the number of experiments to be tried");
        int T = input.nextInt();

        System.out.println("Enter desired probability of Gambler winning");
        double p = input.nextDouble();

        System.out.println("Enter the number of bets Gambler is interested in placing");
        int noofbets = input.nextInt();

        int bets = 0;   // initialize bets
        int wins = 0;   // and wins
        int t = 0;
        while ( t < T ){
            // Run one experiment.

            int cash = stake;
             while (cash>0 && cash < goal) {
                 // simulate one bet.
                     bets++;
                     if (bets == noofbets){
                         System.out.println("cash with Gambler is "+ cash);
                         break;
                     }
                     if (Math.random() < p) cash++;
                     else cash--;
                     // cash is either 0 (ruin) r $goal (win).
             }
               if (cash ==goal) wins++;
            t++ ;
        }
        System.out.println(100*wins/T + "% wins");
        System.out.println("Avg #bets: "+ bets/T);

    }
}
