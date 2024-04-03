public class buy_sell {

    public static int buy_sell(int price[]){
        int buy_price = Integer.MAX_VALUE;
        int Max_Profit = 0;
        for(int i = 0;i<price.length;i++){
            if(buy_price<price[i]){
                int profit = price[i] - buy_price;
                Max_Profit = Math.max(Max_Profit,profit);
            }
            else{
                buy_price = price[i];
            }
        }

        return Max_Profit;
    }

    public static void main(String args[]){

        int price [] ={7,1,5,3,6,4} ;
        System.out.println(buy_sell(price));


    }
    
}
