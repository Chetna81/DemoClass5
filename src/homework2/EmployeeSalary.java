package homework2;

import java.util.Scanner;



public class EmployeeSalary

        // Employee id and Gross salary

  {
    public static void main(String [] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Employee Id");
        String id = scanner.nextLine();

        System.out.println(" Please Enter Employee Name");
        String name = scanner.nextLine();



        System.out.println("Please Enter Employee Basic Salary");
        double salary = scanner.nextInt();

        double hra = salary* 10/100;
        double da = salary* 8/100;
        double ta = salary* 9/100;
        double pf = salary* 20/100;

        double grosssalary = salary + hra + da + ta - pf;

        System.out.println("===============================");
        System.out.println("    Salary Slip                 ");
        System.out.println("================================");
        System.out.println(" Employee Id :" + id);
        System.out.println(" Employee Name : " + name);
        System.out.println(" Employee Basic Salary : " + salary);
        System.out.println(" HRA :" + hra + " DA : " + da );
        System.out.println(" TA :" + ta + " PF : " + pf);
        System.out.println("=================================");
        System.out.println(" Gross Salary : + grosssalary ");
        System.out.println("=================================");

    }

}
