import java.util.*;

public class loopsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum = 1;
        int n = sc.nextInt();
        while ( i<= n) {
           sum +=i;
            i++;
        }
        System.out.println("printed sum of n natrual number: " + sum );

    }

}
