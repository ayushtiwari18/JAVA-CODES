public class palindrome {
     public static boolean is_palindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                //not a palindrome
                
                System.out.println("not palandrome");
                return false;
            }
        }
        System.out.println("is Palandrome");
        return true;
     }

     public static void main(String args[]){
        String str = "Ayush";
        is_palindrome(str);
     }
    
}
