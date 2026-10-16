package com.pluralsight;
import java.util.Scanner;
public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the pickup date: ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter the number of days for the rental: ");
        int daysForTheRental = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Would you like an electronic toll tag? (yes/no): ");
        String tollTag = scanner.nextLine();

        System.out.print("Would you like a GPS? (yes/no): ");
        String gps = scanner.nextLine();

        System.out.print("Would you like roadside assistance? (yes/no): ");
        String roadsideAssistance = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double basicRatePerDay = 29.99;
        double tollTagPerDay = 3.95;
        double gpsPerDay = 2.95;
        double roadsideAssistancePerDay = 3.95;
        double underageSurchargeRate = 0.30;


    }
}
