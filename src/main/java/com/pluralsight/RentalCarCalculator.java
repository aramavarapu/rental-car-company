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

        double baseRental = daysForTheRental * basicRatePerDay;

        double tollTagPrice = switch (tollTag) {
            case "yes", "Yes", "YES" -> tollTagPerDay;
            default -> 0.0;
        };
        double gpsPrice = switch (gps) {
            case "yes", "Yes", "YES" -> gpsPerDay;
            default -> 0.0;
        };
        double roadsidePrice = switch (roadsideAssistance) {
            case "yes", "Yes", "YES" -> roadsideAssistancePerDay;
            default -> 0.0;
        };
        double optionsPrice = (tollTagPrice + gpsPrice + roadsidePrice) * daysForTheRental;

        double underageSurcharge = 0;
        if (age < 25) {
            underageSurcharge = baseRental * underageSurchargeRate;
        }
        double finalPrice = baseRental + optionsPrice + underageSurcharge;

        System.out.println();
        System.out.println("Rental summary");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.println("Number of days: " + daysForTheRental);
        System.out.printf("Basic car rental: $%.2f%n", baseRental);
        System.out.printf("Options cost: $%.2f%n", optionsPrice);
        System.out.printf("Underage driver surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total cost: $%.2f%n", finalPrice);




    }
}
