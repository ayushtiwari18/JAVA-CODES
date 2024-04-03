public class forloopbreakstt {
    public static void main(String args[]){
        for(int i = 1; i<= 100;i++){
            if(i==10){ break;} // loop will break after 9 not print 10
            System.out.println(i);
        }
        System.out.println(" you are out of the loop");
    }
    
}
