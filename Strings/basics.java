import java.util.*;
public class basics {
    public static void main(String args[]){
        String s1 ="abcd";
        String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        // name =  sc.next();
         // System.out.println(name);
         name = sc.nextLine();
        System.out.println(name);

        // concatenation 

        String firstname = "Ayush";
        String lastname = "tiwari";
        String fullname = firstname + " "+ lastname;
        System.out.println(fullname);

        // to find the letter in string 

        System.out.println(fullname.charAt(0));

        // to print all letter in the string

        for(int i =0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i)+" ");
        }
    
    }

    
}
