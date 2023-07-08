package com.Arrays;

public class BridgeHands {

    public static void main(String[] args) {

        // let the possible outcome be labelled as such A = 5-3-3-2; B = 4-4-3-2; C = 4-3-3-3

    int A = 0; int B = 0; int C = 0;

    for(int i = 0; i<4; i++){

        double r = Math.random();

        if (r < 0.333) A++;
        else if (r<0.666)B++;
        else if(r<1.00)C++;
    }

        System.out.println("The number of occurrences are "+ " 5-3-3-2 occurred " + A + " time(s),  4-4-3-2 occurred "+ B + " time(s), 4-3-3-3 occurred "+ C +" time(s)");

    }
}
