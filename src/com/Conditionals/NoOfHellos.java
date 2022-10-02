package com.Conditionals;

import java.util.Scanner;

/*This program prints lines of Hello's based on the input provided.
*
* */
public class NoOfHellos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines of 'Hellos' you want printed");

        int num = input.nextInt();

        if (num>1000) {
            System.out.print("The maximum lines of Hellos that can be printed is 1000\n please re-enter value\n");

             num = input.nextInt();
        }
         for ( int i = 1; i <= num ; i++){

             if (i%1000 ==1) System.out.println(i + "st hello");
             else if (i%1000 ==2) System.out.println(i+"nd hello");
             else if (i%1000 == 3) System.out.println(i+ "rd hello");
             else if (i % 1000> 3) System.out.println(i+ "th hello");
         }

    }

}
