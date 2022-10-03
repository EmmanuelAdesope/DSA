package com.Conditionals;
/* This program prints integers from 1000 to 2000 with five integers per line
* */
public class PrintInteger {
    public static void main(String[] args) {


        for (int i = 1000; i <=2000 ; ) {
           if (i==2000) {
               System.out.println(i);
                   break;
           }
            System.out.printf("%d\t %d\t %d\t %d\t %d\t\n", i , i+1, i+2, i+3, i+4);
           i = i + 5;
        }
    }
}
