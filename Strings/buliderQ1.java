public class buliderQ1 {

    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(str);

        for(int i =1;i<str.length();i++){
            if(str.charAt(i)==' '&& i!=str.length()-1){
                sb.append(str.charAt(i));
                i++;
              char ch2 = (Character.toUpperCase(str.charAt(i)));
                sb.append(ch2);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String str = "hi i am ayush the tiwari";
        System.out.print(toUppercase(str));
    }
    
}
