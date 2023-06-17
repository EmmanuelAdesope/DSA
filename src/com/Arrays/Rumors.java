package com.Arrays;
/* This program calculates the probability that a group of people will hear a rumor. No persons must hear the rumor more than
*  once. It also calculates the number of people that heard the rumor.
*  It involves creating a boolean array found with the same length as number of guests
*  in the party. and then using the index of the string array as reference point to check if any of the guests have been spoken to.
* */

public class Rumors {

    public static void main(String[] args) {


        String [] R = {"Bob", "Tony","Grace", "Victor","Samson", "Emma", "Shade"};

        boolean[] found = new boolean[R.length];

        found[0] = true;

        int count = 1;
        System.out.print(R[0]+" ");
        for(int i =0 ; i<R.length ; i++){

            int r = i + (int) (Math.random()*((R.length)-i));


            if(found[r])break;

            else {found[r] = true;

                String t = R[r];
                  count++;

                System.out.print(t +" ");
            }

        }
        System.out.println();
        System.out.println("number of people to hear the rumour is "+count);
        double probability = (float)count/ R.length;

        System.out.println("probability is "+ (float)probability);

    }
}
