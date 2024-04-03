public class Function6 {
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String args []){// same varible in diffrent function are diffrent
       int a = 4;
       System.out.println(" A = " + a);
       int b = 5;
       System.out.println(" B = " + b);
       int product =  multiply(a,b);// ALWAYS REMEBER TO RENAME THE VARIBLE also can take same varible 
        System.out.println( "PRODUCT IS :" + product );
    }
} 
