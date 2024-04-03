import java.lang.annotation.Target;
import java.util.ArrayList;

public class PairSum1 {
    public static boolean PairSum1(ArrayList<Integer> list,int target ){
        int lp =0;
        int rp = list.size()-1;

        while(lp!=rp){
            //case 1
            if(list.get(lp)+list.get(rp)== target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            if(list.get(lp)+list.get(rp)>target){
                rp--;
            }
        }

        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);// add
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);// add
        list.add(6);

        System.out.println(PairSum1(list, 1312));
        
    }
    
}
