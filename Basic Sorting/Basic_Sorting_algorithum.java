import java.util.Arrays;

public class Basic_Sorting_algorithum {

    public static void bubble_sort(int arr[]){
        for(int turns = 0;turns<arr.length-1;turns++){
            for(int j =0; j<(arr.length-1-turns);j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void Selection_sort(int arr[]){

        for(int i =0;i<arr.length;i++){
            int minPostion = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minPostion]<arr[j]){
                    minPostion = j;
                }
                else{
                    int temp = arr[minPostion];
                    arr[minPostion] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr =i;
            int prev =i-1;
            while(prev>=0 && arr[prev]>arr[curr]){ //arr[prev]<arr[curr] descending order
                arr[prev+1] = arr[prev];
                prev--;} 

           
            arr[prev+1]=curr; 
        }
       
    }







    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");   
        }
    }

    public static void main(String args[]){
        int arr [] ={ 5,4,1,3,2};
       // bubble_sort(arr);
        // Selection_sort(arr);
        //insertion_sort(arr);
       // Arrays.sort(arr);/*time comp o(nlogn) */
        Arrays.sort(arr,0,3);
        printarr(arr);

    }
    
}
