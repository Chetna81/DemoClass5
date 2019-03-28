package homework2;

import java.util.Scanner;
  // created to number and symbol in alphabet

public class EnterAnyNumber12 {
    public static void main(String [] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter any Value:");

        char C = scanner.next(). charAt(0);

        if (Character. isAlphabetic(C))
            {
            System.out.println(" This is Alphabet");
            }
            else if (Character.isDigit(C))
            {
            System.out.println("This is Digit");
            }
            else
            {
           System.out.println("This is Symbol or Special Character");
            }
        }
    }


