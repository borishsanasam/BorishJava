import java.util.*;
public class flow{
    
        void add(int a, int b){
            System.out.println("answer is"+a+b);
        }
        void add (int a, int b, int c){
            System.out.println("answer is "+a+b+c);
        }
         public static void main(String args[]){
    flow obj =new flow();
    obj.add(10,20);
    obj.add(10,20,30);
}
}