import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(924);// add
        list.add(1420);
        list.add(114);
        list.add(142);
        list.add(9);// add
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
    
}
