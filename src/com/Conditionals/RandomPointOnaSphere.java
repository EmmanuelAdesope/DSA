package com.Conditionals;
/* This program generates a random point (x,y,z) on the surface of a sphere using Marsaglia's method:

* */

public class RandomPointOnaSphere {
    public static void main(String[] args) {

        double a, b,c, x, y, z;  //variable declaration

        do
        { // Scale a and b to be random in (-1,1).
            a = 2.0*Math.random() - 1.0;
            b = 2.0*Math.random() -1.0;
        } while (Math.sqrt(a*a + b*b)> 1.0);

        double v = 1 - a * a - b * b;
        c = a*a + b*b ;
        x = 2 * a * Math.sqrt(v);
        y = 2 * b * Math.sqrt(v);
        z = 1 - 2 * c;

        System.out.printf("%.2f %.2f %.2f", x  ,  y , z);

    }
}
