package com.Conditionals;

public class CodeMN {
    public static void main(String[] args) {

        int n = 123456789;
        int m = 0;
         while (n!=0){
             m = (10* m)+ (n % 10);
             n = n/10;
         }
        System.out.printf("%s %d %d","The value of m and n is", m , n);
    }
}
