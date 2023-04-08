package com.Conditionals;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();

        double term = 1.0 ;
        double sum = 0.0;
        long loopCount = 0 ;
        long innerLoopCount = 0;
        long count = 0 ;
        long outcount = 0;
        long start = System.currentTimeMillis();

        for (int n = 1; sum != sum + term; n++)
        {
            outcount += 1;
            sum += term;
            term = 1.0;

            System.out.printf(" %d\n", outcount);

            for( int i = 1; i <= n ; i++)  {
                innerLoopCount +=1;
                term*=x / i;
                System.out.println(innerLoopCount);
             }
             count =  outcount* innerLoopCount;

        }
        loopCount = outcount + count ;

        long end = System.currentTimeMillis();

        float sec = (end - start)/1000F ;

        System.out.println("Time in seconds is" + sec);

        System.out.printf("%d %s %d %s %d", outcount , " + ", count , " =  Total computations done  ", loopCount);

    }
}
