public class Parttern2 {

    public static void hollow_rectangle(int totRows,int totcols){

        for(int i = 1; i<=totRows;i++){

            for(int j = 1; j<= totcols; j++){

                if(i==1|| i==totcols|| j==1||j== totcols){

                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                } }  

               System.out.println();}  }
            
     public static void invert_half_pyramid_withNumber(int n){

        for(int i = 1; i<=n; i++){
            for(int j =1;j<= n- i+1; j++){

                System.out.print(j+"");
            }
            
           System.out.println();
        }
     }

     public static void inverted_rotated_half_pyramid(int n){

        for(int i = 1; i<=n; i++){
            for(int j =1;j<= n- i; j++){

                System.out.print(" ");
            }

            for(int j = 1; j <= i;j++){

                System.out.print("*");
            }
            
           System.out.println();
        }
     }
   

     public static void floyds_triangle(int n){

        int counter = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
        
            System.out.println("");
        }
        
     }

     public static void zero_one_triangle(int n){

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=i;j++){

                if((i+j) % 2 == 0){ 
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
     }

     public static void butterfly_pattern(int n){

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            for(int j= 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n;i>=1;i--){
             for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            for(int j= 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
     }

     public static void solid_rhombus(int n){

        for(int i = 1;i<=n;i++){

            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<= n; j++){
                System.out.print("*");
            }
           /*  for(int j =i; j>=1;j--){
                System.out.print(" ");

            }*/
         System.out.println( );
        
        }
     }

     public static void hollow_rhombus(int n){

        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){

                System.out.print(" ");
            }
            // hollow rectangle- stars
            for(int j =1;j<=n; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
     }

     public static void dimaond(int n){

        for(int i =1; i<=n;i++){

            for(int j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
           System.out.println();
    }

        for(int i= n;i>=1;i--){
            for(int j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
           System.out.println();

        }
     }

     public static void number_pyramid(int n){

        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
     }

     public static void Palindromic_pattern(int n){

        for(int i= 1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            for(int j = 2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }

    public static void main(String args[]){
      hollow_rectangle(7,7);
      invert_half_pyramid_withNumber(10);
      inverted_rotated_half_pyramid(6);
      floyds_triangle(5);
      zero_one_triangle(5);
      butterfly_pattern(10);
      solid_rhombus(5);
     hollow_rhombus(5);
     dimaond(4);
     number_pyramid(5);
     Palindromic_pattern(5);
    }
    
}
