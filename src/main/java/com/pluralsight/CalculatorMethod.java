package com.pluralsight;
import java.util.Scanner;

public class CalculatorMethod {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userName = getUserName(myScanner);
        int hoursWorked = getHoursWorked(myScanner);
        double payRate = getPayRate(myScanner);
        double grossPay = calculateGrossPay(hoursWorked, payRate);
        System.out.println(userName + "'s gross pay for this period is: " + grossPay);
    }

    public static String getUserName(Scanner myScanner) {
        System.out.println("Please enter your name: ");
        return myScanner.nextLine();
    }

    public static int getHoursWorked(Scanner myScanner) {
        System.out.println("Please enter how many hours you worked: ");
        return myScanner.nextInt();
    }

    public static double getPayRate(Scanner myScanner) {
        System.out.println("Please enter your hourly pay rate: ");
        return myScanner.nextDouble();
    }

    public static double calculateGrossPay(int hoursWorked, double payRate) {
        return hoursWorked * (hoursWorked > 40 ? 1.5 * payRate : payRate);
    }
}
