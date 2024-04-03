import java.util.*;

public class demo {
    public static void main(String arg[]){
        int marks [] =new int [100];
        
        Scanner sc = new Scanner(System.in); 
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();

        System.out.println("phy:" + marks [0]);
        System.out.println("chem:" + marks [2]);
        System.out.println("maths:" + marks [3]);
        System.out.println("ed:" + marks [4]);
    }
    
}
