package homework2;

import java.util.Scanner;
 //program to check whether a character is uppercase or lowercase

public class UpperAndLowerCase {
    public static void main(String [] args ){

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Enter Alphabet in Uppercase : ");

        String alpha = scanner.nextLine();

        String result;

        result = alpha. toLowerCase();


        System.out.println(" Print Alphabet in Lowercase" + result);

        }
    }

