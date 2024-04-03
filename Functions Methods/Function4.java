import java.util.*;
// TYPES OF PARAMETERS
public class Function3 {
    public static int calculatesum(int num1,int num2){// parameters or formal parameters
      
        int sum = num1 + num2 ;
        return sum;
        
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
       int sum = calculatesum(a,b);// Arguments for Actual parameters
    System.out.println("SUM IS :" + sum);

    }
    
}
