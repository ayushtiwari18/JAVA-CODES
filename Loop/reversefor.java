import java.util.*;

public class reversefor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while(n > 0) {
            int lastDigit = n%10;
             n/=10;
            reverse = (reverse* 10 + lastDigit);
         }
          System.out.println(reverse);}
    }
