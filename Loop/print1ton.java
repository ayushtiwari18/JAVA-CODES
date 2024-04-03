import java.util.*;

public class print1ton { // user se input 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = 1;
        System.out.println("enter n : ");
        int n = sc.nextInt();
        while(number <= n) {
            System.out.println(number);
            number++;
        }
    }
    
}
