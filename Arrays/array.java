import java.util.*;

public class array {

    public static void array(){
        //input 
        Scanner sc  = new Scanner(System.in);
          int marks []= new int[50];

        marks[1] =sc.nextInt();
         marks[2] =sc.nextInt();
          marks[3] =sc.nextInt();

          System.out.println("phy"+ marks[1]);
          System.out.println("maths"+ marks[2]);
          System.out.println("chem"+ marks[3]);

          //update the value
          marks[2]=marks[2]+1;
          System.out.println("maths updated "+marks[2]);

          // size of array

          System.out.println("length of array:-"+ marks.length);
    }

    public static void update(int marks[]){
        for(int i= 0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }

        for(int i= 0;i<marks.length;i++){
        System.out.println("marks "+ marks[i]);
        }
    }

    public static int linear_Search(int num[],int key){

        for(int i =0;i<num.length;i++){
            if(num [i] == key){
                return i;
            }
        }
        return -1;
        
    }


    public static int get_largest(int number []){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

    for(int i =0; i<number.length;i++){
        if(largest<number[i]){
            largest = number[i];
        }
        if(smallest>number[i]){
            smallest = number[i];
        }}
        System.out.println("Smallest value is:- "+ smallest);
        
    
    return largest;
    }

    public static int binary_screach(int num [],int key){ // conditon array must be in ascending order
        int start =0;
        int end = num.length;
        while(start<=end){
            int mid =(start+end)/2;

            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end =mid -1;
            }
        }
        return -1;
    }

    public static void reverse(int number[]){ // conditon array must be in ascending order
         int first = 0;
         int last = number.length-1;

         while(first<last){

            int temp = number[last];
            number[last] =number [first];
            number[ first] =temp;

            first++;
            last--;

         }
        

    }

    public static void print_pair(int number []){
        
        int tp =0;
        for(int i = 0;i<number.length;i++){

          int curr =number[i];

            for(int j= i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("number of pairs :- " + tp);
      
          
    }

    public static void print_subarray(int number[]){
       int tp=0;
        for(int i=0;i<number.length;i++){
            int start= i;
        for(int j=1;j<number.length;j++){
            int end =j;
        for(int k=start;k<=end;k++){
            System.out.print(number[k]+" ");
            
        }
        System.out.println();
        
        }
        System.out.println();
        tp++;
        }
        System.out.println("number of pairs "+ tp);
    }

    public static void max_subarray(int number[]){

        int currsum=0;
        int maxsum  = Integer.MIN_VALUE;

        for(int i =0;i<number.length;i++){
            int start = i;
            for(int j=i-1;j<number.length;j++){
                int end = j;
                for(int k = start;k<=end;k++){
                    currsum+= number[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }System.out.println("maxsum =:"+ maxsum);

       
    }
    public static void max_subarrayII(int number[]){

        int currsum=0;
        int maxsum  = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] =number[0];
        
        for(int i = 1;i<prefix.length;i++){
            prefix[i]=prefix [i-1] + number[i];
        }


        for(int i =0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                currsum =start ==0 ? prefix[end]: prefix[end]-prefix[start -1];

                if(maxsum<currsum){
                    maxsum=currsum;
                }
            
            }
        }System.out.println("maxsum =:"+ maxsum);

       
    }


    public static void kadanes(int number[]){
        int ms =Integer.MIN_VALUE;
        int cs =0;

        for(int i=0;i<number.length;i++){
            cs = cs+number[i];

            if(cs<0){
                cs = 0;
            }
            ms =Math.max(cs,ms);
        }
        System.out.println("maxsum :- "+ ms);
    }
    

    public static void main(String args []){
       //array();
       /*  int marks[] = {90,80,79};
       update(marks);

       int numbers[]={2,4,6,8,10,12,14,16};
       int key =10;

       int index = linear_Search(numbers, key);
       if(index==-1){
        System.out.println("key not found");
       }
   else{
        System.out.println("key is at index:- "+ index);
    }
    
}*/

   /*  int number[]={1,2,6,4,5};
     System.out.println("largest of a number is:- "+get_largest(number)); */
     
     /*int number[]={2,4,6,8,10,12,14,16};
     int key= 12;
     System.out.println("the key is :- "+ binary_screach(number, key));*/

    /*  int number [] ={2,4,6,8,10};
     reverse(number);
     
     for(int i =0;i<number.length;i++){
        System.out.print(number[i]+ " ");
     }*/

     int num[]= {-2,-3,4,-1,-2,1,5,-3};
     //print_pair(num);

     //print_subarray(num);
     max_subarray(num);
     max_subarrayII(num);
     kadanes(num);






}
}