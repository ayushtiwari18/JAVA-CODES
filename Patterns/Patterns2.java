public class Patterns2 {
    public static void main(String args []) { // SAME LOGIC AS USED BEFORE
        int n = 10;
        for (int i =1 ; i<= n; i++) { // FORMULA IS (n- i + 1) = number of stars in one line
            for (int s= 1; s<=(n - i + 1);s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
