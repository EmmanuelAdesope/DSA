package com.Arrays;
/* This program takes a command-line argument N and prints N Poker hands(five cards each) from a
* a shuffled deck, separated by blank lines and a comma.
* */
import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {
        // initialize variables

        System.out.println("Enter value N");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        // create a deck of cards
        String[] suit = {"clubs", "Diamonds", "Hearts", "Spades"};

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[52];
        int p = 0;
        for (String s : rank)
            for (int j = 0; j < suit.length; j++, p++) {
                deck[p] = s + " of " + suit[j];
                System.out.println(deck[p]);
            }


        for (int k = 0; k < N; k++) {
            //Take sample
            for (int m = 0; m < 5; m++) {
                int r = m + (int) (Math.random() * (deck.length - m));
                String t = deck[r];
                deck[r] = deck[m];
                deck[m] = t;
            }


            // Print sample.
            for (int i = 0; i < 5; i++)
                System.out.print(deck[i] + ", ");
            System.out.println();

        }
    }
}



