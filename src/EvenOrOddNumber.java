import java.util.Scanner;

public class EvenOrOddNumber
{
    public static void main(String [] args )
    {
        Scanner s = new Scanner(System.in);

        // defining a variable//

        int number = 12;
        // check if the number is divisible by 2 or not//

        if (number % 2 == 0)
        {

            System.out.println(" You entered an even number .");
        } else
        {
            System.out.println("You entered an odd number .");
        }

    }
}
