package homework2;

import java.util.Scanner;

public class VoteAge
       {
         public static void main(String[] args)
       {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter your age");

        double age = scn.nextDouble();

        //age can be in months too so using double

        if (age >= 18)
        {
            System.out.println(" Congratulation ! You can vote");
        } else
        {
            System.out.println(" Sorry ! You can not vote");
        }
        }
        }