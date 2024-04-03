import java.util.*;

public class Q1 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
          System.out.println(" ENTER A ");
        int a = sc.nextInt();// WE CAN USE DOUBLE
          System.out.println(" ENTER B ");
        int b = sc.nextInt(); // WE CAN USE DOUBLE
          System.out.println(" ENTER C ");
        int c = sc.nextInt();// WE CAN USE DOUBLE
          System.out.println(" Average of three number is :");
          System.out.print(Average(a, b ,c ));// YE DONO EK HI MA PRINT HO SKATA HAI
    }
    public static int Average(int a,int b,int c){
       
        int average = (a + b + c)/3;

        return average;
        /*public static double average (double X,double y,doublez){
                return (x+ y+ z)/3;
        } */// WE CAN USE THIS OPTIMISED WAY ALSO
    }}
