import java.util.*;

public class Function2 {
    public static void calculatesum(int num1,int num2){// retrun type name (type param 1,type param2)
                                                         // body
                                                          // retrun statement;
        int sum = num1 + num2 ;
        System.out.println("SUM IS :" + sum); // NAME OF VARBILE CAN BE CHANGED 
        
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A");
        int a = sc.nextInt();
        System.out.println("ENTER B");
        int b = sc.nextInt(); 

        calculatesum(a,b);// WE HAVE TO NAME THE VARIBLE AGAIN AS PER REQIRMENT
    

    }
    
}
