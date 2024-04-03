import java.util.*;

public class Q3 {
    public static void reverse(int n){
      while( n > 0 ){
        int lastDigit = n%10;
        System.out.print(lastDigit);
        n = n/=10;}
      
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
        if( n%10 == n%10){
            System.out.println("palindrome");
        }
    }
    
}
