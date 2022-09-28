package com.Conditionals;
/* This program prints the relative lengths of the subdivision of a Ruler.
* */

import java.util.Scanner;

public class Ruler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         //prompts user for input
        System.out.println("Enter value");
         int N = input.nextInt();
          String ruler = " ";
           for (int i = 1; i<=N ; i++) {
               ruler = ruler + i + ruler;
               System.out.println(ruler);
           }


    }
}
