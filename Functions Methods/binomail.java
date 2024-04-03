public class binomail {
    public static int factorial(int n){
        int f = 1;

    for(int i = 1; i<=n;i++){
        f = f*i;
    }
      return f; // we will use this to find n!/r!(n-r)!
    }
    public static int  biocff(int n, int r){
        int fact_n = factorial(n); // calculated n!
        int fact_r = factorial(r); // calculate r!
        int fact_nmr = factorial( n - r); // Calculated (n-r)!

        int biocoeff = fact_n/(fact_r * fact_nmr);
        return biocoeff;// calculated the value and stored it in the varible biocoeff
    }
    public static void main(String args[]) {
     System.out.println(biocff(10,5));
     //System.out.println(factorial(7));
    }
    

}
