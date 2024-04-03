public class Function8op {
    public static boolean isPrime(int n) {
        if (n ==2){
           return true;
       }
        for(int i =2;i<=Math.sqrt(n);i++){// the value will check for 2 to under root n eg;3 = 1.763;
            if(n%i==0){
          return false;
         } 

        }
         return true;
    }
    
    public static void main(String args[]){
    System.out.println(isPrime(4));}
}
