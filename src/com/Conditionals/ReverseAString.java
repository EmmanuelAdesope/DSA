package com.Conditionals;

import java.util.Arrays;
import java.util.Scanner;

/*
This program takes a string input from the command line and reverses the input

 */
public class ReverseAString {
    public static void main(String[] args) {

        //create new object of scanner class
        Scanner input = new Scanner(System.in);

        // Prompts user for input
        System.out.println("Enter a string");
        String userWord = input.nextLine();

        // create an array of characters using the userWord length

        char [] userWordArray = new char[userWord.length()];

        /*
        This is to create a count for the loop. usually the index for an array is length-1.
        java starts from 0 index
         */
        int n = userWord.length()-1 ;

        // reverse the userWord using a for loop

        for( int i = n ; i>=0 ; i--) {

            userWordArray[n-i] = userWord.charAt(i);
        }
          // print the array

        System.out.println(Arrays.toString(userWordArray));
		
		// print the reversed joined string
		System.out.println(String.copyValueOf(userWordArray));

    }
}
