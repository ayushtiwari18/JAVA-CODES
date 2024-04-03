import java.util.*;

public class cost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float easar  = sc.nextFloat();

    
        float total = pencil + pen + easar;

        System.out.println("Bill is : " + total);
        
        // add on - with 18% gst
        float newTotal = total + ( 0.18f * total);

        System.out.println(" bill with GST is : " + newTotal);
    }
    
}
