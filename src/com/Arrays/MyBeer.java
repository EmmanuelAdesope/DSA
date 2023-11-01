package com.Arrays;
/* Suppose a party of n guests are being held. Each guest holding a can of beer or soda, and leaves when  this program calculates
*  the fraction of times a guests picks his initial beer if all guests leave the building
* and come into the building picking beers randomly when it is dark.
* */

import java.util.Scanner;

public class MyBeer {

    public static void main(String[] args) {

        int count = 0;

        Scanner input = new Scanner(System.in); //creates new scanner class

        System.out.println("Please enter number of guests n");
        int n = input.nextInt();

        String [] guest = new String[n]; // creates an array of string

        for(int i = 0; i<n ; i++){ //each guest take a can of beer or soda

            double r = Math.random();

            if(r<0.5) guest[i] ="beer";
            else guest[i] = "soda";
        }



        System.out.println();
       for(int k = 0 ; k<1000 ; k++) { //run the simulation of random walk of the guests picking beers and sodas dropped on the floor
           for (int i = 0; i < n; i++) {

               int j = i+ (int) (Math.random() * (n- i));

               if (i == j) count++;
           }
       }
      System.out.printf("%.3f", (float)1000/count);

    }
}
