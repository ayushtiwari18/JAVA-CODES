public class patterns1 {
    public static void hollow_rectangle(int totRow, int totcols){
        // outloop
    for(int i =1; i<= totRow; i++){
        //inner loop
        for(int j = 1;j<=totRow;j++){
            if (i==1 || i == totRow || j== 1  || j== totcols ){
                //boundary cells
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
    public static void main(String args[]){
      hollow_rectangle(4, 4);
    }
    
}
