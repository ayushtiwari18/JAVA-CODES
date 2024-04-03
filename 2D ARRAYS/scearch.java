public class scearch {
     

    public static boolean staircase_search(int matrix[][],int key){
        int n = matrix.length;
        int i = 0;
        int j = n-1;

        while(j>=0 && i<n){
            if(matrix[i][j]==key){
                System.out.println("key found " + "("+ i+","+j+ ")");
                return true;
            }
            else if(matrix[i][j]<key){
                i++;
            }
            else if(matrix[i][j]>key){
                j--;
            }
           
        }
        System.out.println("not found");
         return false;
    }
    public static void main(String args[]){
        int matrix [][] ={{10,20,30,40},
                           {15,25,35,45},
                        {27,29,37,48},
                    {32,33,39,50}};
        int key =33;
        staircase_search(matrix, key);

    }
    
}
