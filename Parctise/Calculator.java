import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int B = sc.nextInt();
        char oprator = sc.next().charAt(0);

         switch (oprator) {
            case '+' :{
                System.out.println(A + B);
            }
               break; 
            case '-': {
                System.out.println( A - B);
                break;
            }

            case '*' :{
                System.out.println( A * B);
                break;
            }
                
         
            default:{
                System.out.println("INVAILD DATA");
            }
                break;
         }


    }
}
