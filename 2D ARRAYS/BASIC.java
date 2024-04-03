import java.util.*;
public class BASIC {

    public static void main(String args[]){
        
         int n =  5 ;//  marks.length;
        int m =  3; //marks[0].length;
        int marks[][] = new int [n][m];
        Scanner sc = new Scanner(System.in);

        // input 
        for(int i = 0;i<n;i++){
            
                System.out.println("enter  marks of student "+i );
                for(int j = 0;j<m;j++){
                    marks[i][j] =sc.nextInt();
                }
            
        }
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(marks[i][j] +" ");
            }
            System.out.println();
        }
    }
}