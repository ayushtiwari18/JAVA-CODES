import java.util.*;

public class ifprime {

    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            boolean is_Prime = true;

            for(int i = 2; i<=n-1;i++){

                if(n%i==0){
                    is_Prime = false;
                    System.out.println("NOT PRIME");
                   break;
                }
               
           }
           if(is_Prime==true){
            System.out.println("prime"); }
            

    }
    
}
