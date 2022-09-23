package com.Conditionals;


/* This program calculates base conversion from base 10 to other bases.  There's a trace of the results line by line.
* */
import java.util.Scanner;

public class BaseConv {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
         // prompts user for number to be converted
            System.out.println("Enter number ");
            long i = input.nextLong();
          // prompts user for base to be converted to
            System.out.println("Enter base ");
            int k = input.nextInt();

            if ( i>k && k < 10)
            {
                long m = 0 ;
                long n  ;
                String base = " ";
                while (i/k !=0)
                {  m = i/k;
                    n = i%k;
                    base = n + base;
                    System.out.println("Trace "  + m +"  " +  n + "  "+ base);
                    if( m < k)
                    { long a = m/k ;
                        n = m - (a*k);
                        base = n + base ;
                        System.out.println("Trace "  + a +"  " +  n + "  "+base);
                    }

                    i = m;
                }
            }
            else  if(i>k && k >10)
            {
                long m = 0 ;
                long n = 0 ;
                String base = " ";
                while (i/k !=0)
                {  m = i/k;
                    n = i%k;
                    // base = n + base;
                    //System.out.println("Trace "  + m +"  " +  n + "  "+ base);
                    if (n==10)
                    {base = "A" + base;
                        System.out.println("Trace " + m +" " + n + " "+ base);
                    }
                    else if(n==11)
                    {  base = "B" + base;
                        System.out.println("Trace" + m +" " + n + " "+ base);
                    }
                    else if(n==12)
                    { base = "C" + base;
                        System.out.println("Trace" + m +" " + n + " "+ base);
                    }
                    else if(n==13)
                    { base = "D" + base;
                        System.out.println("Trace" + m +" " + n + " "+ base);
                    }
                    else if(n==14)
                    { base = "E" + base;
                        System.out.println("Trace" + m +" " + n + " "+ base);
                    }
                    else if (n==15)
                    { base = "F" + base;
                        System.out.println("Trace" + m +" " + n + " "+ base);
                    }
                    else if (n<10)
                    { base = n + base;
                    }System.out.println("Trace "  + m +"  " +  n + "  "+ base);

                    if( m < k)
                    { long a = m/k ;
                        n = m - (a*k);
                        base = n + base ;
                        System.out.println("Trace "  + a +"  " +  n + "  "+base);
                    }
                    i = m;
                }
            }
        }
}
