package com.Conditionals;

import java.util.Scanner;

public class LoanPayments {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Principal");
        long p = input.nextLong();

        System.out.println("Enter the rate");
        double r = input.nextDouble();

        System.out.println("Enter the number of years");
        double t = input.nextDouble();

        double interest = p * r * t ;
        double req = p * Math.exp(r*t);
        double monthlypay = Math.exp(r*t);
     //   double remain;
      //  double req = p + interest;
        System.out.println("req is "+ req);
        System.out.printf("%s\t %.3f\t ", "monthly repayment is", monthlypay);
        System.out.printf("%s\t %s\t\n", "Monthly Repayment", "Remaining Principal");

     //   while(repay!=req){

         //   remain = req - repay;
         //   System.out.printf("%f\t %f\t\n", repay, remain);

        //    repay = repay+repay;

    //    }
    }
}
