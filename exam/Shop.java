import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in the cart: ");
        int numberOfItems = scanner.nextInt();
        int[] prices = new int[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ₹");
            prices[i] = scanner.nextInt();
        }
        System.out.print("Are you a premium member? (yes/no): ");
        String membershipStatus = scanner.next().trim().toLowerCase();
        boolean isPremiumMember = membershipStatus.equals("yes");
        double totalPrice = calculateTotalPrice(prices, isPremiumMember);
        System.out.printf("The total price of items in the cart is: ₹%.2f%n", totalPrice);
        scanner.close();
    }
    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }
        if (isPremiumMember) {
            totalPrice *= 0.95; 
        }
        if (totalPrice > 5000) {
            totalPrice *= 0.90;
        }
        return totalPrice;
    }
}