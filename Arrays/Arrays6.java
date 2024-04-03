public class Arrays6 {
    public static int binarySearch(int number[],int key){
        int start =0, end = number.length -1;

        while (start<=end){
            int mid = (start+end)/2;
       
        //Camparisons
        if(number[mid]==key){
            return mid;                    // time compexcity of binary search is less than linear search
        }                                    // in LS O(n)           //in BS O(log(n))
        if (number[mid]<key){
            start = mid +1;
        }  
        else{
            end = mid-1;
        } 
    }
   
     return -1; 
     } 

     public static void main(String args []){
        int number [] = {2,4,6,8,10,12,14};
        int key = 15;

        System.out.println("index for the key is:" + binarySearch(number ,key));
     }
}
