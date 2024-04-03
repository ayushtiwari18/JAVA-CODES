import java.util.*;

public class conditionalsatt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("vote");}

        if ( age > 13 && age <= 18){
            System.out.println("muthall moli");
        }    
        else {System.out.println("teenage not eligible");}
    }
    
}
