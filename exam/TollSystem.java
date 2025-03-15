import java.util.Scanner;

public class TollSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
           
            System.out.print("Enter vehicle type (Car/Truck): ");
            String vehicleType = scanner.nextLine().trim();
            System.out.print("Does the vehicle have an RFID pass? (yes/no): ");
            String hasRFID = scanner.nextLine().trim().toLowerCase();
            double tollFee = calculateTollFee(vehicleType, hasRFID.equals("yes"));
            if (tollFee >= 0) {
                System.out.printf("The toll fee for the %s is: ₹%.2f%n", vehicleType, tollFee);
            } else {
                System.out.println("Invalid vehicle type entered.");
            }
            System.out.print("Do you want to process another vehicle? (yes/no): ");
            continueInput = scanner.nextLine().trim().toLowerCase();

        } while (continueInput.equals("yes"));
        scanner.close();
        System.out.println("Thank you for using the toll system!");
    }
    public static double calculateTollFee(String vehicleType, boolean hasRFID) {
        double tollFee = 0;
        if (vehicleType.equalsIgnoreCase("car")) {
            tollFee = 100;
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            tollFee = 200;
        } else {
            return -1;
        }
        if (hasRFID) {
            tollFee *= 0.9;
        }

        return tollFee;
    }
}