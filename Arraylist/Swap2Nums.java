import java.util.ArrayList;

public class Swap2Nums {
    public static void Swap2Nums(ArrayList<Integer>list ,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);// add
        list.add(10);
        list.add(11);
        list.add(12);
        int idx1 = 1;
        int idx2 = 3;
        System.out.println(list);
        Swap2Nums(list, idx1, idx2);

    }
    
}
