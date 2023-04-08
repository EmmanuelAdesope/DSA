package com.Arrays;

public class EuclideanDistance {
    public static void main(String[] args) {

        int [] a = {2, 5, 6, 7, 8, 9};
        int [] b = {4, 6, 89, 34, 6};
        int sum = 0;
        for (int i = 0; i< b.length; i++)
        {
            int v = Math.abs(a[i] - b[i]);
        sum += v * v;
        }
        double root = Math.sqrt(sum);
        System.out.println(root);
    }
}
