import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class PairSum2 {
    public static boolean PairSum2(ArrayList<Integer> list,int target){
         int bp = -1;
         int n = list.size();
        for(int i =0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;

            }
        }

        int lp = bp+1;
        int rp = bp;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }
            if(list.get(lp)+list.get(rp)>target){
                rp = (rp+n-1)%n;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();

        list.add(11);// add
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);// add
        list.add(10);
    
      System.out.println(PairSum2(list,14));
    }
}
