import java.util.*;
public class removeNthnode {
  
        public LinkedList removeNthFromEnd(LinkedList head , int n) {
            int size = 0;
            LinkedList temp = head;
            while(temp != null){
                temp = temp.next;
                size++;
            }
            int i =1;
            int iTofind = size-n;
            LinkedList prev = head;
    
            while(i<iTofind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
    
            return head;
        }

        public static void main(String args[]){
            LinkedList<Integer> head = new LinkedList<>();
            head.add(1);
            head.add(2);
            head.add(3);
            head.add(4);      
            head.add(5);

            System.out.println(head);
            
                        


        }
    
 }
    

