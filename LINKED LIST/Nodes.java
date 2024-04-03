public class Nodes {
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
        System.out.print("null");
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(3, 3);
        ll.print();
       


      
    }
    
}
