package com.Arrays;
/* This program calculates the dead end probability and average walk length of a self avoiding walk for a 3-D dimension walk;
* It confirms that the probability of dead ends is zero and calculates the average walk length.
* */
import java.util.Scanner;

public class SelfAvoidingWalk3D {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);   //creates a new scanner class

        System.out.println("Enter the dimension N, of the 3D lattice");

        int N = input.nextInt();

        System.out.println("Enter the number of Trials T");

        int T = input.nextInt();

        int escapePaths = 0;
        int deadEnds = 0;

for(int t = 0; t <T ; t++){

    boolean [][][] p = new boolean[N][N][N];
    int x = N/2 ; int y = N/2 ; int z = N/2 ;
while(x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1){

                //check for a dead end a make a random move
        p[x][y][z] = true;
if(p[x-1][y][z]&& p[x+1][y][z]&& p[x-1][y-1][z]&& p[x-1][y+1][z]&& p[x][y][z-1]&&p[x][y][z+1]&&p[x+1][y+1][z]&&p[x+1][y-1][z]&&p[x][y+1][z]&&p[x][y-1][z]&&p[x][y+1][z+1]&&p[x][y+1][z-1]&&p[x][y-1][z+1]&&p[x][y-1][z-1]&&p[x-1][y][z-1]&&p[x-1][y][z+1]&&p[x+1][y][z-1]&&p[x+1][y][z+1]&&p[x+1][y+1][z-1]&&p[x+1][y+1][z+1]&&p[x-1][y-1][z-1]&&p[x+1][y-1][z-1]&&p[x+1][y-1][z+1]&&p[x-1][y-1][z+1]&&p[x-1][y+1][z-1]&&p[x-1][y+1][z+1]){

    deadEnds++ ; break;
}

        double r = Math.random();

    if (r<0.038) {if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&& (!p[x-1][y][z]))x--; escapePaths++;}
    if (r<0.076) {if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1 && (!p[x][y-1][z-1]))y--;z--; escapePaths++;}
    if(r<0.114)  {if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1 && (!p[x+1][y][z]))x++;escapePaths++;}
    if(r<0.152) {if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1 &&(!p[x+1][y-1][z]))x++; y--; escapePaths++;}
    if(r<0.19)  {if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1 && (!p[x+1][y][z+1]))x++;z++; escapePaths++; }
    if(r<0.228){ if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x-1][y-1][z]))x--;y--; escapePaths++;}
    if(r<0.266) {if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x][y-1][z+1]))y--;z++;escapePaths++;}
    if(r<0.304) {if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x][y][z+1]))z++; escapePaths++;}
    if(r<0.342) {if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x][y+1][z]))y++;escapePaths++;}
    if(r<0.38){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x][y-1][z]))y--;escapePaths++;}
    if(r<0.418){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x-1][y+1][z]))x--;y++;escapePaths++;}
    if(r<0.456){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x+1][y+1][z]))x++;y++;escapePaths++;}
    if(r<0.494){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x-1][y-1][z+1]))x--;y--;z++;escapePaths++;}
    if(r<0.532){ if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x+1][y-1][z+1]))x++;y--;z++;escapePaths++;}
    if(r<0.57){if  (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x-1][y+1][z+1]))x--;y++;z++; escapePaths++;}
    if(r<0.608){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x][y][z-1]))z--;escapePaths++;}
    if(r<0.646){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x-1][y-1][z-1]))x--;y--;z--; escapePaths++;}
    if(r<0.684){ if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x-1][y+1][z-1]))x--;y++;z--;escapePaths++;}
    if(r<0.722){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x+1][y-1][z-1]))x++;y--;z--;escapePaths++;}
    if(r<0.76){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x+1][y][z-1]))x++;z--;escapePaths++;}
    if(r<0.798){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x-1][y][z-1]))x--;z--;escapePaths++;}
    if(r<0.836){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x-1][y][z+1]))x--;z++;escapePaths++;}
    if(r<0.874){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&& (!p[x+1][y+1][z+1]))x++;y++;z++;escapePaths++;}
    if(r<0.912){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x+1][y+1][z-1]))x++;y++;z--;escapePaths++;}
    if(r<0.95){if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1&&(!p[x][y+1][z+1]))y++;z++;escapePaths++;}
    if(r<1.00) { if (x>0 && x < N -1 && y>0 && y<N-1 && z>0 && z<N-1 && (!p[x][y+1][z-1]))y++;z--;escapePaths++;}
            }


        }

        System.out.println(deadEnds + "  dead ends");
        System.out.println(escapePaths/T+" Average walk lengths");




    }
}
