package method;

public class Return {
    // Method to add two integers and return the result
    public static int add(int a, int b) {
        return a + b; // Return the sum of a and b
    }

    public static void main(String[] args) {
        // Call the add method and store the result
        int result = add(12, 13); // Call the add method
        
        // Print the result
        System.out.println("The sum of 12 and 13 is: " + result); // Print the result
    }
}