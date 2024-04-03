public class LL {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data= data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; 

    //ADD FUNCTION 

    // ADD 
    public void addFirst(int data){ //add node to first 
        // create a NODE
       
        Node newNode = new Node(data); 
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // LINK 
        newNode.next = head;

        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        //link 
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
    }

    //ADD FROM THE MIDDLE
    public void add(int idx,int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        if(idx ==0){
            addFirst(data);
            return;
        }

        int i =0;
        while(i<idx-1){ // we have to reach the idx -1 value
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
             temp = temp.next;
        }
        System.out.println("null");
    }
    // REMOVE 
    public int removeFirst(){
        if(size==0){// no head value
            System.out.println("LL IS EMPTY");
        
        return Integer.MIN_VALUE;}
        else if(size==1){ // only head value
            int val =head.data;
            head = tail =null;
            size= 0;
            return val;
        }
        int val =head.data; // head + next value in ll
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL iS EMPYT");
            return 0;
        }
        else if(size==1){
            int val = head.data;
            head = tail =null;
            size =0;
            return val;
        }
        Node prev =head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val =prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
   public int itrSearch(int key){
    Node temp = head;
    int i =0;

    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
   }
   public int helper(Node head,int key){
    if(head==null){ // base case
        return -1;
    }
    if(head.data==key){// found case;
        return 0;
    }
    int idx = helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
   }

   public int recSearch(int key){
    return helper(head, key);
   }

   // REVERSE OF THE LINKED LIST

   public void reverse(){
    Node prev = null;
    Node curr = tail =head;
    Node next;

    while(curr != null){
        next =curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
   }

   public void deleteNthfromEnd(int n){
    // Calculate size
    int sz = 0;
    Node temp = head;
    while (temp!= null){
        temp = temp.next;
        sz++;
    }
    if(n==sz){
        head = head.next; // remove first;
        return;}

        //sn -n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next =prev.next.next;
        return;
    }

    // check IF PALNDROME OR NOT
    
    // STEP 1 to find middle
    public Node FindMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast !=null&& fast.next != null){
            slow =slow.next ;
            fast = fast.next.next;
        }
        return slow ;
    }

    public boolean checkPalindrome(){
        if(head == null||head.next!= null){
            return true;
        }
        //step 1 find mid
        Node midNode = FindMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
   


    public static void main(String[] args){
        LL ll = new LL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
      //  ll.add(3, 4);
        ll.print();
       // System.out.println(ll.size);
      // ll.removeFirst();// remove head 
     //  ll.print();

       //ll.removeLast();// remove tail
      // ll.print();

      //System.out.println(ll.itrSearch(4));
      //System.out.println(ll.recSearch(4));

     // ll.reverse();
      // ll.print();

      //ll.deleteNthfromEnd(3);
     // ll.print();
      System.out.println(ll.checkPalindrome());

      


      
    }
    
}
