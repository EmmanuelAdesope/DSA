package com.Arrays;
/* This is a program that prints the average number of left to right minima in permutations
generated. That is the average number of times an element is the smallest seen so far.
* */

import java.util.Scanner;

public class PermutationMinima {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);    //creates a scanner class

        System.out.println("Enter the size of the integer to be permuted");

        int N = input.nextInt();

        System.out.println("Enter the number of times M, the permutation will be done");

        int M = input.nextInt();

        double [] a = new double[N+1];                //Initializing the arrays a and b
        double [] b = new double[N+1];

        for(int j =0; j<M ; j++){              // does M permutations of the integer N

            int r = (int)(Math.random()*N);       // generates a random number which will be used to calculate the
             double term = 1;                     // permutation NPr

             if(r == 0){                          // condition checks if r = 0 as the for loop doesn't get executed for r =0
                 b[r]+= 1;
                 a[N]+=1;
             }

            for(int i=N; i>N-r; i--){               //Calculates the permutation nPr

                term *= i ;
                b[r]+= 1;
                a[i] +=1 ;
            }
            System.out.println("No "+j+",  "+ N+ " " + "permutation "+ r + " = "+term);
        }

       for (int i = 0; i <N ; i++) {         // calculates the average number of left to right minima in the permutation

             a[i] /=  M;
             b[i] /= M;
      }

        for (int i = 1; i<N; i++){          //Prints the average number of times each element n , (n-1) , (n-2) occurred

            System.out.printf("%.4f, %s", a[i],"  ");

        }

        System.out.println();             //Prints the average number of times each permutation occurs i.e how many times an
        for (int i = 0; i<N; i++){         // element nPr occurs

            System.out.printf("%.4f, %s", b[i],"  ");
        }



    }


}
