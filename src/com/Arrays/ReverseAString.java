package com.Arrays;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {


        //create new object of scanner class
        Scanner input = new Scanner(System.in);

        // Prompts user for input
        System.out.println("Enter a string");
        String userWord = input.nextLine();
        char temp ;

        for (int i = 0; i<userWord.length()/2; i++){

            temp = userWord.charAt(i);

         //   userWord.charAt(i) = userWord.charAt(userWord.length()-1);

        }


    }
}
