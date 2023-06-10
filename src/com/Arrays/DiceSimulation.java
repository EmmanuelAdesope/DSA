package com.Arrays;

import java.util.Scanner;

public class DiceSimulation {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number of times you wish to run the experiment");

        long noOfTrials = input.nextLong(); //creates new scanner class

         int  two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0, twelve = 0;

        for (int i =1 ; i<=noOfTrials ; i++){

        int  dice1 = 1 + (int)(6 * Math.random());
        int  dice2 = 1 +  (int)(6 * Math.random());

            switch (dice1 + dice2) { //count the frequencies of the sum of the two die
                case 2 -> two++;
                case 3 -> three++;
                case 4 -> four++;
                case 5 -> five++;
                case 6 -> six++;
                case 7 -> seven++;
                case 8 -> eight++;
                case 9 -> nine++;
                case 10 -> ten++;
                case 11 -> eleven++;
                case 12 -> twelve++;
            }


        }

        System.out.printf("%s , %.3f\n","number of times the sum of 2 occurred" , (float)two/noOfTrials );
        System.out.printf("%s, %.3f\n", "number of times the sum of 3 occurred", (float)three/noOfTrials );
        System.out.printf("%s, %.3f\n", "number of times the sum of 4 occurred ", (float)four/noOfTrials );
        System.out.printf("%s, %.3f\n","number of times the sum of 5 occurred", (float)five/noOfTrials );
        System.out.printf("%s, %.3f\n","number of times the sum of 6 occurred ", (float)six/noOfTrials );
        System.out.printf("%s, %.3f\n","number of times the sum of 7 occurred ", (float)seven/noOfTrials );
        System.out.printf("%s, %.3f\n","number of times the sum of 8 occurred ", (float)eight/noOfTrials );
        System.out.printf("%s, %.3f\n","number of times the sum of 9 occurred ", (float)nine/noOfTrials );
        System.out.printf("%s, %.3f\n","number of times the sum of 10 occurred ", (float)ten/noOfTrials );
        System.out.printf("%s, %.3f\n","number of times the sum of 11 occurred ", (float)eleven/noOfTrials );
        System.out.printf("%s, %.3f\n","number of times the sum of 12 occurred ", (float)twelve/noOfTrials );

    }

}
