public class overloading2 {
    public static int sum(int a, int b){
        return a + b;
   }
    
    public static double sum(double a , double b){
        return a + b;
    }
    
    public static void main(String args []){
        System.out.println(sum(3,5));
        System.out.println(sum(2.98,4.98));
    }
}
