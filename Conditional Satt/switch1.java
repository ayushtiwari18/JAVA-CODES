import java.util.*;

public class switch1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1: System.out.println(" SAMOSA ");// if we not use break all will print 

            case 2: System.out.println( "Burger ");

            case 3: System.out.println( "MANGO SHAKE ");

            default: System.out.println( " NO ORDER ");
        }
    }
    
}
