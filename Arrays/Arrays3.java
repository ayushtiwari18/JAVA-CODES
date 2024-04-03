public class Arrays3 { 
// PASSING ARRAY AS ARGUMENTS
    public static void update(int marks[]){
        for (int i = 0;i<marks.length;i++){
            marks[i] = marks [i]+1;
        }
    }
                                                    //ARRYS CAN ONLY BE CALLED BY 
    public static void main(String args []){                // CALL BY REFENCE WORK
        int marks[] = {97,79,55};                 // VALUED CHANGED IN ANY FUCTION THEN THE VALUE IN THE FUCTION ALSO CHANGES
       
         /*  System.out.println(marks[0]);
         System.out.println(marks[1]);
         System.out.println(marks[2]);*/
        for(int i = 0; i<marks.length;i++){ // {OPTIMIZED} 
         System.out.println(marks[i]);}
        
         
            update(marks);
              System.out.println("UPADATED MARKS");

        // PRINT OUR MARKS
         for(int i = 0; i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
         System.out.println();
    }
    
}
