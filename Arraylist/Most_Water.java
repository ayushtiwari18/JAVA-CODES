import java.util.ArrayList;

public class Most_Water {
    public static int store_Water(ArrayList<Integer>hieght){
        int maxWater = 0;
        int lp = 0;
        int rp = hieght.size()-1;

        while(lp<rp){
            // calulate Water 
            int ht = Math.min(hieght.get(lp),hieght.get(rp));
            int width = rp-lp;
            int CurrWater = ht*width;
            maxWater = Math.max(maxWater, CurrWater);
            // update 
            if(hieght.get(lp)<hieght.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }

     public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();

        list.add(1);// add
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);// add
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);// add

        System.out.println(store_Water(list)); 
        
       
    }
    
}
