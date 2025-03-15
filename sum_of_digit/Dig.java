import java.util.Scanner;

public class Dig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
                System.out.println("Enter the number:");
        int i = scanner.nextInt();          
              System.out.println("Enter the number:");
        int j = scanner.nextInt();          
               if (i > j) {
            System.out.println("number.");
        } else {
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += k; 
            } 
            System.out.println("The total sum " + i + " to " + j + " is: " + sum);
        }
            }
}