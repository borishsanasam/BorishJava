package terurntype;

public class Return {
       public static int add(int a, int b) {
        return a + b; 
    }
    public static void main(String[] args) {       
        int result = add(12, 13); 
        System.out.println("The sum of 12 and 13 is: " + result); 
    }
}