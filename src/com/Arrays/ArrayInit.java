package com.Arrays;

import java.util.Scanner;

public class ArrayInit {

    public static void main(String[] args) {
        // program that declares and initializes an array of size 1000


        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int [] a = new int [N * N * N];
        for(int i = 0; i<N ; i++){
            a[i] =0 ;
        }
      //  System.out.println(a[1000]);


    }

}
