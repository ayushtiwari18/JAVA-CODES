import java.util.*; // UTILITY PACAKAGE

public class Arrays5 {
    public static int getLarger(int[] number){
        int largest = Integer.MIN_VALUE;// this CODE IS FOR -INFINITY
        int Smallest = Integer.MAX_VALUE;// THIS CODE IS FOR +INFINITY

        for(int i = 0; i<number.length;i++){
            if(largest<number[i]){
                largest =number [i];
            }
            if(Smallest>number[i]){
                Smallest = number[i];
            }
        }

            System.out.println("Smallest value is :" + Smallest);

           
       
       return largest;
    }

    public static void main(String args[]){
        int number[] = {1,2,6,3,5};
        System.out.println("Largest Value is:" + getLarger(number));
    }

    
}
