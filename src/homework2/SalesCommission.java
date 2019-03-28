package homework2;

import java.util.Scanner;

public class SalesCommission
     {
        public static void main(String[] args)
     {
        Scanner scn = new Scanner(System.in);

        System.out.println(" Please enter the Sales Id: ");
        int sal = scn.nextInt();

        System.out.println(" Please enter the  Seller's First Name: ");
        char name = scn.next().charAt(0);

        System.out.println(" Please enter Seller's Last Name:  ");
        char last = scn.next().charAt(0);

        System.out.println(" Enter Sales Amount: ");
        double amount = scn.nextDouble();

        System.out.println(" Enter Salary Basic:");
        double basic = scn.nextDouble();

        if (amount >= 50000) {
            double rate = (amount * 35 / 100);
            double total = (basic + rate);
            System.out.println(" Salary with commission is: " + total);
        } else if (amount >= 30000) {
            double rate = (amount * 20 / 100);
            double total = (basic + rate);
            System.out.println(" Salary with commission is: " + total);
        } else if (amount >= 20000) {
            double rate = (amount * 10 / 100);
            double total = (basic + rate);
            System.out.println(" Salary with commission is : " + total);
        } else if (amount >= 10000) {
            double rate = (amount * 5 / 100);
            double total = (basic + rate);
            System.out.println(" Salary with Commission is :" + total);
        } else if (amount < 1000) {
            double rate = (amount * 2 / 100);
            double total = (basic + rate);
            System.out.println("Salary with commission is :" + total);
        } else {
            System.out.println(" Invalid ");
        }
        }
        }