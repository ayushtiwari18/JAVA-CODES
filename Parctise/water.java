public class water { 
    public static int trapping_water(int height[]){
   int n = height.length;
         int leftMax[] = new int[n];
         leftMax[0] = height[0];
         for(int i =1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
         }

         int rightMax[] = new int[n];
         rightMax[n-1] = height[n-1];
         for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
         }

         int trappedwater =0;
         int waterlevel = 0;
         for(int i=0;i<n;i++){
             waterlevel = Math.min(leftMax[i],rightMax[i]);
         
         trappedwater += waterlevel-height[i];}

         return trappedwater;
    }


    public static void main(String args[]){
        int heigth[] = {4,2,0,6,3,2,5,3};
       
        System.out.println( trapping_water(heigth));
    }
    
}