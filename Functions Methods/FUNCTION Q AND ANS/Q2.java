public class Q2 {
    public static boolean isEven(int n){
        boolean isEven = true;
        if (n%2 == 0){
            isEven = true; }
        
        else{
         isEven = false;
        }
        return isEven;
        
    }
    public static void main(String args []){
        System.out.print(isEven(9));
    }
}
