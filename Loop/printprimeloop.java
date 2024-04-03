import java.util.*;
// THE CODE WILL TELL ONLY NOT PRIME NUMBERS PRIME NUMBERS WILL PASS THROUGH
public class printprimeloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();
        
        boolean isprime = true;
        for (int i = 2; i <=n-1; i++)
        
        if (n%i==0){ // n is a multiple of i ( i not eqiule to 1 or n)
          isprime = false;
        System.out.println(" NOT PRIME");{break;}
        }
        //System.out.println("PRIME");

        }
    }
