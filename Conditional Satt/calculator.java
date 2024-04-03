import java.util.*;

public class calculator {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter A ");
        int A = sc.nextInt();
        System.out.println("enter B ");
        int B = sc.nextInt();
        System.out.println(" enter operator");
        char operator = sc.next().charAt(0);// aage padhoge iske bare ma

        switch(operator) {
            case '+':System.out.println( A + B);
                     break;
            case '-':System.out.println( A - B );
                     break;
            case '*':System.out.println( A * B );
                     break;
            case '/':System.out.println( A/B );
                     break;

            default:System.out.println( " INVAILD ");
        }

    }
    
}
