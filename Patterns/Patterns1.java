public class Patterns1 {// NESTED LOOP === loop ke andar loop
    public static void main(String args[]) { /* FRIST for line loop
                                              SECOND for to print star */
        for(int line= 1;line<=10;line ++) {
            for (int star =1; star<= line; star++){
                System.out.print("*");// WE CAN PRINT MORE PATTERN BY INCREASE VALUE OF "LINE"
            }
            System.out.println();
        }
    }
    
}
