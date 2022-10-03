package com.Conditionals;

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
