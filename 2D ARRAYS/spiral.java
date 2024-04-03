public class spiral {
     

    public static void Spiral(int matrix[][]){

        int startRow = 0;
        int startcol = 0;
        int endRow = matrix.length -1;
        int endcol = matrix[0].length -1;

        while(startRow<=endcol&& startcol<=endcol){
            // top 
            for(int j =startRow;j<=endcol;j++){
                System.out.print(matrix[startRow][j]+" ");

            }

            // right
            for(int i =startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endcol]+" ");

            }

            // bottom
            for(int j = endcol-1;j>=startcol;j--){
                
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" " );
            }

            // left
            for(int i =endRow-1;i>startRow;i--){
               
                if(startRow==endcol){
                    break;
                } 
                System.out.print(matrix[i][startcol]+" ");
            }
            startRow++; endcol--;
            startcol++; endRow--;
        }
        System.out.println();
    }

    public static void main(String args[]){

        int matrix[][] = {{1, 2, 3, 4,5},
                         {5, 6, 7, 8,6},
                         {9, 10, 11, 12,13},
                         {13, 14, 15, 16,17}};

      Spiral(matrix);
}
}