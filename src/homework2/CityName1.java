package homework2;

import java.util.Scanner;
  // program is CityName invalid

public class CityName1 {
    public static void main(String [] args ){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please Enter Alphabet");

        String CityName = scanner.next();

        if ( CityName. equalsIgnoreCase("a"))
        {
            System.out.println(" Ahmadabad");
        }
        else if  (CityName. equalsIgnoreCase("b"))
        {
            System.out.println("Baroda");
        }
        else if (CityName. equalsIgnoreCase("c"))
        {
            System.out.println("Calcutta");
        }
        else if (CityName. equalsIgnoreCase("d"))
        {
            System.out.println("Delhi");
        }
        else if (CityName. equalsIgnoreCase("e"))
        {
            System.out.println("England");
        }
        else if (CityName. equalsIgnoreCase("f"))
        {
            System.out.println("France");
        }
        else
        {
            System.out.println("You are in wrong city");
        }
    }
    }

