import java.util.Scanner;

public class finding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine(); 
        findAndCountVowels(input);
        scanner.close();
    } 
    public static void findAndCountVowels(String str) {
        int count = 0; 
        StringBuilder vowelsFound = new StringBuilder(); 
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++; 
                vowelsFound.append(c).append(" "); 
            }
        }
        System.out.println("Number of vowels: " + count);
        System.out.println("Vowels found: " + vowelsFound.toString().trim());
    }
}