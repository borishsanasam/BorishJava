public class Count{
     public static void main(String[] args){
        for(int i=2020;i<2030;i++){
         if ((i % 4 == 0 && i % 100 != 0) ||(i % 400 == 0)){
         System.out.println(i+"leap year");
         }
         else{
         System.out.println(i +" not");
         }
         }
         }
}
     
    
