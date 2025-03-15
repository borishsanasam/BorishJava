import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number");
        int num =scan.nextInt();
        boolean isPrime = true;
        for( int i=2; i<=num/ 2; i++){
            if(num % i ==0){
                isPrime = false;
                break;
                
            }
        }
        if(isPrime){
            System.out.println("prime");

    }else{
        System.out.println("not prime");
    }
    }
}