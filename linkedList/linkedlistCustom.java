package linkedList;

public class linkedlistCustom {

    private Node head; // at first it is null
    private Node tail;
    private int size;
    public linkedlistCustom(){ // this is a constructor
        this.size=0;
    }

    public void insertFirst(int val){
        Node node= new Node(val);
        node.next= head; // links the new node to the first node or null
        head= node;

        if(tail== null){
            tail=head;
        }

        size+=1;
    }

   public  void display(){
    Node temp= head;
    while(temp!= null){
        System.out.print(temp.value +"->");
        temp= temp.next;
    }
    System.out.println("END");
   }

   public void insertLast(int val){

    if(tail== null){
        insertFirst(val);
        return;
    }
    Node node= new Node(val);
    tail.next= node;
    tail= node;
    size++;
   }


   public void insert(int val , int index){
    if(index== 0){
        insertFirst(val);
        return;
    }

    if(index == size){
        insertLast(val);
        return ;


    }

    Node temp= head;
    for(int i=1;i<index;i++){
        temp= temp.next;
    }

    Node node= new Node(val, temp.next);
    temp.next= node;
    size++;
   }


   public int deleteFirst(){
    int val= head.value;
    head= head.next;
    if(head==null){
        tail= null;
    }
    size--;
    return val;

   }

   public Node find(int value){
    Node node= head;
    while(node != null){
        if(node.value==value){
            return node;
        }
        node= node.next;
    }
    return node;

   }

   public int deleteLast(){
    if(size <=1){
        return deleteFirst();
    }
    Node secondLast= find(size-2);
    int val= tail.value;
    tail= secondLast;
    tail.next= null;
    return val;


   }


   public int delete(int index){
    if(index==0){
        return deleteFirst();
    }
    if(index==size){
        return deleteLast();
    }
    Node prev= find(index-1);
    int val= prev.next.value;
        prev.next= prev.next.next;

    return val;




   }


   // insert using recursion

   public void insertrec(int val, int index){
    head = insertRec(val, index,head);
    /*  For index > 0, it technically works without capturing it because head just ends up re-pointing to itself. But to support inserting at the very beginning, you must catch that returned node and update head.*/ 
    
   }

   private Node insertRec(int val, int index, Node node){
    if(index ==0){
        Node temp= new Node(val, node);
        size++;
        return temp;
    }

    node.next= insertRec(val, index-1, node.next);
   }

    private class Node{
        private int value;
        private Node next;
    

    public Node(int value){ // this is a constructor
        this.value=value;

    }



    // reversiong a Linklist by using recursion
    private void reverse(Node node){
        if(node == tail){
            head= tail;
            return;
        }

        reverse(node.next);
        tail.next= node;
        tail=node;
        tail.next= null;
    }

    // inplace reversing of a linked list.
    public void reverseInplace(){
        if(size < 2){
            return;
        }
        Node prev= null;
        Node present= head;
        Node next= present.next;
        while(present != null){
            present.next= prev;
            prev= presnt;
            present= next;
            if(next != null){
                next= next.next;
            }
        }
        head= prev; 
    }
    public Node(int value, Node next){
        this.value=value;
        this.next=next;
    }

}
    
}
