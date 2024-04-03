import java.util.Scanner;

public class import java.util {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int num = sc.nextInt();

            // Using printf to format the output
            System.out.printf("%-15s%03d%n", s1, num);
        }

        System.out.println("================================");

        sc.close();
    }
}
