package homework2;

import java.util.Scanner;
      // input number positive,negative


public class PositiveNegativeZero
      {
           public static void main(String [] args)
      {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the number :");
          int n = in.nextInt();
           if (n > 0)
               System.out.println( " Number is Positive ");
           else if (n < 0)
               System.out.println( " Number is negative ");
           else
               System.out.println(" Zero ");
      }
      }
