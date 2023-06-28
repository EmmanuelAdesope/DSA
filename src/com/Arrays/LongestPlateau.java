package com.Arrays;
/* This program prints the length and location of each contiguous plateau in an array. Using a sample array of integers.
* You can deduce the length and modify the code further
* */

public class LongestPlateau {

    public static void main(String[] args) {



        int[] a = {0, 1, 2, 3, 4, 6, 6, 6, 3, 7, 5, 5, 5, 5, 2, 10, 1, 4, 4, 4, 4, 3, 5, 6, 5, 1, 2, 2, 2, 2, 0, 1, 5, 6, 7, 9, 10};
        int count;
        int j = 2;

        for (int i = 1; i < a.length - 1; i++, j++) {

            count = 0;

            if(a[i-1]<a[i]) {
                while (j < a.length && (a[i] == a[j])) { // keeps array in bound and checks for equal values


                    System.out.println(i + " " + count); // prints the location & count
                    count++;
                    if (a[i+2]<a[i+1]) System.out.println("location is "+ (j-count) + " size is "+ (count+1));
                    i++;
                    j++;


                }


            }





        }


    }

}
