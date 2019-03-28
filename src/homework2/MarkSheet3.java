package homework2;

import java.util.Scanner;
     // ...student subject ,roll no,and total//


public class MarkSheet3 {
    public static void main(String [] args ){
        Scanner scanner = new Scanner((System.in));
        System.out.println(" Enter the student Name ");
        String  name = scanner.nextLine();

        System.out.println(" Enter Roll NO ");
        int roll = scanner.nextInt();

        System.out.println(" Enter marks out of 100 of 1st subject");
        int sub1 = scanner.nextInt();

        System.out.println(" Enter marks out of 100 of  2st subject ");
        int sub2 = scanner.nextInt();

        System.out.println(" Enter marks out of 100 of 3st subject");
        int sub3 = scanner.nextInt();

        float P;
        int total = sub1 + sub2 + sub3;
        P =  (total /3 ) ;

        System.out.println(" Student" + sub1 + sub2 +sub3 );
        System.out.println("===========================");
        System.out.println(" Name" + name );
        System.out.println("===========================");
        System.out.println("===========================");
        System.out.println(" Roll no" + roll);
        System.out.println("===========================");
        System.out.println(" Account" + sub1);
        System.out.println(" Maths + sub2");
        System.out.println(" Economic" + sub3);
        System.out.println("===========================");
        System.out.println("Total" + total);
        System.out.println("===========================");
        System.out.println("===========================");
        System.out.println(" percentage" + P);
        System.out.println("===========================");
        //if
        //   (sub1  > 0 && sub2 > 0 && sub3 > 0)

        if ( P >= 80)
        { System.out.println("/n / tA+");
        }
        else if ( P >= 60)
        {
            System.out.println("/n / tA");
        }
        else if ( P >= 50)
        {
            System.out.println("/n / tB ");
        }
        else if ( P >= 35)
        {
            System.out.println("/n /tC");
        }
        else
        {
            System.out.println((" /n / t fail"));
        }
        }
        }
