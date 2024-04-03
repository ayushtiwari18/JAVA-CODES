import java.util.*;

public class switchstt {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) { // use of break statement only that outcome will be printed
            case 1: System.out.println(" SAMOSA ");
                   break;
            case 2: System.out.println( "Burger ");
                   break;   

            case 3: System.out.println( "MANGO SHAKE ");
                   break;

            default: System.out.println( " NO ORDER ");
                   break;
        }
    }
    
}
