import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args ){
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter any Year: ");
        int Year  = s.nextInt();
        boolean flag = false ;
        if ( Year % 400 == 0)
        {
            flag = true;
        }
        else if ( Year % 100 == 0)
        {
            flag = false;
        }
        else if ( Year % 4 == 0)
        {
            flag = true;
        } else
            {
            flag = false;
        }
        if (flag)
        {
            System.out.println(" Year" + Year + " is a Leap Year ");
        } else
            {
            System.out.println(" Year" + Year + " is a not Leap Year ");
        }

    }
}
