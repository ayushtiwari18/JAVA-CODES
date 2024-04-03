import java.util.*;

public class passorfail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR SCORE");
        Float number = sc.nextFloat();

        String type = ( ( number >= 33))? "PASS":"FAIL";
        System.out.println(type);
    }    
}
