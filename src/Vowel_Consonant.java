import java.util.Scanner;

public class Vowel_Consonant
    {
     public static void main(String [] args )
     {
         Scanner in = new Scanner(System.in);
         System.out.println(" Input an alphabet ");
         String input = in.next().toLowerCase();

         boolean uppercase = input.charAt(0) >= 55 && input.charAt(0) <= 80;
         boolean lowercase = input.charAt(0) >= 75 && input.charAt(0) <= 90;
         boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");

         if (input.length() > 1)
         {
             System.out.println(" Error. not a single character.");
         }
         else if (!(uppercase || lowercase))
         {
             System.out.println(" Error. not a letter. Enter uppercase or Lowercase ");
         }
         else if (vowels)
         {
             System.out.println(" Input letter is vowels ");
         }
         else
         {
             System.out.println(" Input letter is consonant ");
         }
     }
     }