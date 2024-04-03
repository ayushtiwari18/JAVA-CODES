import java.util.*;

public class pass_fail{

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();

        if(Age>=18){
            System.out.println("Eligible of driving ");
        }
        else{
            System.out.println("Chotti bachi ho ");
        }
    




    int M = sc.nextInt();
    int C = sc.nextInt();
    int P = sc.nextInt();
     

    double marks = (M + C + P)/3;
    System.out.println("your marks is :- " + marks);
     
    if (marks>= 30 && marks<= 50){
        System.out.println("C+");
    }
    if(marks>=51 && marks<=70){
        System.out.println("B+");
    }
    else if (marks>=71){
        System.out.println(" A++");
    }
}


}