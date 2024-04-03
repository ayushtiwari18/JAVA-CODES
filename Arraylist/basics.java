import java.util.ArrayList;

public class  basics {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> Str = new ArrayList<>();

        // operation 
        list.add(9);// add
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);//o(n)
        //get funtion
       System.out.println(list.get(2)); //O(n)
       // deletion
        list.remove(2);//O(n)
        System.out.println(list);
        //update 
        list.set(1,14);
        System.out.println(list);
        //contain elements
        System.out.println(list.contains(14));
        //Arraylist SIZE
        System.out.println(list.size());

        //OR
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }


}