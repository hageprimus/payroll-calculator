package com.pluralsight;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();

        System.out.println("Please enter how many hours you worked: ");
        double hoursWorked = myScanner.nextDouble();

        System.out.println("Please enter your hourly pay rate: ");
        double payRate = myScanner.nextDouble();

        double grossPay = hoursWorked * (hoursWorked > 40 ? 1.5 * payRate : payRate);
        System.out.println(userName + "'s gross pay for this period is: " + grossPay);
    }
}
