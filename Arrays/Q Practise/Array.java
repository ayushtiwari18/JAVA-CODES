import java.util.*;
public class Array{

    // self 
    public static boolean Distinct_arr(int arr[]){
     int n = arr.length;
     int largest = Integer.MIN_VALUE;

     for(int i = 0;i<n;i++){//7
        largest = Math.max(largest,arr[i]);
     }
     boolean outcome = false;
     int count[] = new int[largest + 1];
     for(int i =0;i<n;i++){
        count[arr[i]]++;
     }

     for(int j =0; j<count.length;j++){
        if(count[j]>1){
           outcome = true;
        }
    
     }
     return outcome;
    }
// brute force

    public static boolean Duplicate(int num[]){
        for(int i =0; i<num.length;i++){
            for(int j =0;j<num.length;j++)
          if( num[i]==num[j]){
            return true;
          }
        }
        return false;
    }
// optimised 
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> set = new HashSet<>(); 
         for(int i=0; i<nums.length; i++) {
        if(set.contains(nums[i])) { return true;
        } else {
        set.add(nums[i]);
        }
        }
        return false;

    public static void main(String arg[]){
        int arr [] ={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
      // System.out.println(Distinct_arr(arr));
       System.out.println(Distinct_arr(arr));
    }
}
}