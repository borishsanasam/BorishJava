import java.util.*;
public class grate {
    void calculateGrade(int marks){
        if(marks>=90){
            System.out.println("A grade");
        }
        else if(marks>=70){
            System.out.println("B grade");
    }
    else if(marks>=5){
            System.out.println("C grade");
} 
else{
    System.out.println("F grade");
}
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        qq17 qq = new qq17();
        System.out.println("Enter the mark");
        int mark = obj.nextInt();
        qq.calculateGrade(mark);
    }
}