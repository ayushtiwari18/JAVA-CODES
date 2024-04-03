public class Arrays4 {
    public static int LinearSearch(int num[],int key){
        for (int i=0;i<num.length;i++){
            if(num [i]== key){
                return i;
            }
        }
        return -1;
    } 

    public static void main(String args []){
        int num [] = {2, 4,6,8,10,12,14,16};
        int key = 16;

        int index = LinearSearch(num, key);
        if(index == -1){
            System.out.println("Not Found ");
        }
      else {
        System.out.println("Key in index "+ index);
    }
     }// TIME COPEXCIITY DEPEND ON "N" N = NO. OF OPERATION
    
}
