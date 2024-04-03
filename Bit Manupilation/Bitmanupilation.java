public class Bitmanupilation {
    public static void OddorEven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.println("NUMBER IS EVEN");
        }
        else{
            System.out.println("NUMBER IS ODD");
        }
    }

    public static int getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0 ;

        }else{
            return 1;
        }
    }

    public static int SetIthbit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int ClearIthBit(int n ,int i){
        int bitmask = ~(1<<i);
        return n& bitmask;
    }

    public static int UpadateIthbit(int n,int i,int newbit){

        if(newbit == 0){
            return ClearIthBit(n,i);
        }
        else{
            return SetIthbit(n,i);
        }
    }

    public static int UpadateIthbit1(int n,int i,newBit){
        
    }

    public static void main(String args[]){
        //OddorEven(5);
       //System.out.println(getIthBit(15, 2));
       System.out.println(SetIthbit(10,2 ));
       System.out.println(ClearIthBit(11, 3));
       System.out.println(UpadateIthbit(15,3,0));

    }
}
