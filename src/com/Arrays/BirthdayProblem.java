package com.Arrays;
/* This program calculates the number of people that needs to enter the  room before
*  there's a match between the  birthdays of two people.
* */
public class BirthdayProblem {
    public static void main(String[] args) {

       boolean [] match = new boolean[365];

       int count = 0;

       while (true){

           int r = (int) (Math.random()*365);

           if(!match[r]){count++;match[r]=true; }
           else break;
       }
        System.out.println("Number of people that entered before there was a match "+ count);
    }
}
