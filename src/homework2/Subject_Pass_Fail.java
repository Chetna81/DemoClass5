package homework2;

import java.util.Scanner;

public class Subject_Pass_Fail
        {
         private static Scanner sc;
         public static void main(String[] args)
       {
        String studentname;
        int maths, science, economic, Rollno;
        float total, percentage;
        sc = new Scanner(System.in);
        System.out.println(" Enter student name:");
        studentname = sc.next();
        System.out.println(" Enter student Roll no:");
        Rollno = sc.nextInt();
        System.out.println(" Enter maths marks: ");
        maths = sc.nextInt();
        System.out.println(" Enter science marks: ");
        science = sc.nextInt();
        System.out.println(" Enter economic marks: ");
        economic = sc.nextInt();
        total = maths + science + economic;
        percentage = (total / 300) * 100;
        System.out.println(" Total marks = " + total);
        System.out.println(" percentage = " + percentage);
        if ((maths >= 35) && (science >= 35) && (economic >= 35))
        {
            System.out.println(" STUDENT PASS ");
        } else
            System.out.println(" STUDENT FAIL");
        }
        }
