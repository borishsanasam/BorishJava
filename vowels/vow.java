import java.util.Scanner;

public class vow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String v[] ={ "a","e","i","o","u",};
        Scanner input = new Scanner(System.in);
        String answer = scanner.nextLine(); 
        int detect = 0;
        int i =0;
        while(i<=4){
            if(answer.equals(v[i])){
                detect =1;
            }
            i=i+1;
        }
        if(detect==1){
            System.out.println("vowels");
        }
        else{
            System.out.println("non vowels");
        }
    } 
}