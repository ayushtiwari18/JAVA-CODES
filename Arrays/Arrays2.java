import java.util.*;
// INPUT/OUTPUT IN ARRAY
public class Arrays2 {
    public static void main(String args []){
        int marks [] = new int[100];

        Scanner sc = new Scanner(System.in);
        // int phy;
        //phy = sc.nextInt();

        marks [0] = sc.nextInt();
        marks [1] = sc.nextInt();
        marks [2] = sc.nextInt();
        marks [3] = sc.nextInt();

        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);
        System.out.println("Eng : " + marks[3]);


        marks[2] = marks[2] +1;
        System.out.println("math: " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2]+marks[3])/3;
        System.out.println("percentage = "+ percentage + " % ");
    }
    
}
