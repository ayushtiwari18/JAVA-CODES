public class overloading1 {
    public static int sum(int a, int b){
        return a+ b;

    }// FUNCTION OVERLOADING USING PARAMETER
    public static int sum2(int a, int b, int c){
     return a+ b + c;}
    
    
    public static void main(String args []){
        System.out.println(sum(5,6));
        System.out.println(sum2(9,8,8));
    }
}
    
