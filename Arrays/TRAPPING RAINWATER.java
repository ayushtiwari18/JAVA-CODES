public class TRAPPING RAINWATER {

    public static int trapped_rainwater(int height[]){
        int n = height.length;
        //calulate left max boundary- array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i =1;i<=n;i++){
            leftMax[i] =Math.max(height[i],leftMax[i-1]);
        }

        //calulate rigth max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1]= height[n-1];
        for(int i= n-2;i>=0;i--){
            right[i] =Math.max(height[i],rightMax[i+1]);
        }
         int trappedwater = 0;
         for(int i=o;i<=n;i++){
         int waterlevel = Math.min(leftMax[i],rightMax[i])
        trappedwater = waterlevel - height[i] //**width */
    }
    }

    public static void main(String args[]{
        int height[]={4,2,0,6,3,2,5,3};
        System.out.println(trapped_rainwater(height))
    })
    
}
