package com.Arrays;
/* Suppose people enter a room until any two people have a birthday within a day of each other
This program computes the probability of such event.
* */

public class Birthday {
    public static void main(String[] args) {

        int count = 0; //initialize counter

        boolean [] match = new boolean[365]; // creates a boolean array

        while(true){

            int r = (int) (Math.random()*(365)+ 1);

            match[r] = true;

            if(match[r-1]) break;
            else count++;
        }

        System.out.println(count);
    }
}
