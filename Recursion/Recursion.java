public class Recursion {

    public static void PrintDec(int n){
        //base case
       if(n==1){
          System.out.print(n+ " ");
          return;
       }

         System.out.print(n+" ");
         PrintDec(n-1);
       
    }

    public static void PrintInc(int n){
        //base case
       if(n==1){
          System.out.print(n+ " ");
          return;
       }
         PrintInc(n-1);
          System.out.print(n +" ");
       
    }

    public static int PrintFactorial(int n){
        //base case
       if(n==0){
          return 1;
       }
       // kaam
         return n* PrintFactorial(n-1);
       
    }
    public static int PrintSum(int n){
        //base case
       if(n==1){
          return 1;
       }
         return n + PrintSum(n-1);
       
    }
    public static int fac(int n){
        //base case
       if(n==1||n==0){
          return n;
       }
       int Fnm1 = fac(n-1);
       int Fnm2 = fac(n-2);
       int Fn = Fnm1+Fnm2;

       return Fn;

       
    }
    public static Boolean isSorted(int arr[],int i){
        //base case
       if(i == arr.length-1){
          return true;
       }

       //kaam
       if(arr[i]>arr[i+1]){
        return false;
       }
       return isSorted(arr, i+1);
       
    }
    public static int firstOccurence(int arr[],int i,int key){
        //base case
        if(i==arr.length){
            return-1;
        }
       if(arr[i] == key){
          return i;
       }

       return firstOccurence(arr, i+1,key);
    }

     public static int lastOccurence(int arr[],int i,int key){
        //base case
        if(i==arr.length){
            return-1;
        }
        int isFound = lastOccurence(arr, i+1, key);
       if(isFound == -1 && arr[i] == key){
          return i;
       }
       return isFound;
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

     public static int optimizedPower(int a,int n){//O(logn)
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        halfPower = halfPower *halfPower;

        if(n%2!=0){
            halfPower = a*halfPower;
        }
        return halfPower;
    }

    public static int tilingProblem(int n) { // 2 x n (floor size)
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        return friendsPairing(n-1)+ (n-1)* friendsPairing(n-2);
    }

    public static void printBinStrings(int n, int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printBinStrings(n-1,0, str+"0");

        if(lastPlace == 0){
            printBinStrings(n-1,1,str+"1");
        }
    }

    public static void main(String args[]){
      //PrintInc(10);
     //System.out.println(PrintFactorial(5)); 
    // System.out.println(PrintSum(12));
   // System.out.println(fac(10));
    int arr [] ={1,2,8,4,5,1,8,4,5};
    //System.out.println(isSorted(arr, 0));
   // System.out.println(firstOccurence(arr, 0, 5));
    //System.out.println(lastOccurence(arr, 0, 8));
    //System.out.println(power(2, 6));
    //System.out.println(optimizedPower(2, 6));
   // System.out.println(tilingProblem(6));
   // System.out.println(friendsPairing(3));
    printBinStrings(5, 0, " ");
    }
    
}
