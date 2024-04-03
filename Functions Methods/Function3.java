import java.util.*;
// CHANGE IN RETRUN TYPE HERE INT
public class Function3 {
    public static int calculatesum(int num1,int num2){
      
        int sum = num1 + num2 ;
        return sum;// WE HAVE TO RETRUN THE TYPE IN THIS CASE {INT SUM}
        
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A");
        int a = sc.nextInt();
        System.out.println("ENTER B");
        int b = sc.nextInt(); 
       int sum = calculatesum(a,b); // CALL BY VALUE
    System.out.println("SUM IS :" + sum);

    }
    
}
