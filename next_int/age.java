import java.util.*;

public class age{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
     
        System.out.println("Enter your age:");
        int age = input.nextInt(); 
        
        System.out.println("Your age: " + age);
        
        input.close(); 
    }
}