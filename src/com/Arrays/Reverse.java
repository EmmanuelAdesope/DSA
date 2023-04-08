package com.Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        String [] c = {"box", "of", "matches" , " is ", "good"};

        for(int i = 0; i<= c.length/2 ; i++) {
           String temp = c[i];
            c[i] = c[(c.length-1)-i];
            c[(c.length-1)-i] = temp ;
              }
        System.out.println(Arrays.toString(c));

        }
    }

