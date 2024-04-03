import java.util.ArrayList;

public class Max {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
         list.add(3);
          list.add(4);
           list.add(512345);
            list.add(6);
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
             largest = Math.max(largest,list.get(i));
        }
        System.out.println("YOUR MAXIMUM VALUE IS :-  "+ largest);
    }
    
}
