package linkedList;

public class leetcode83 {
    public static void main(String[] args){

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head== null){
            return head;
        }
        ListNode node= head;
        while(node.next!= null){
            if(node.val==node.next.val){
                node.next= node.next.next;
            } else{
            node=node.next;}
        }
        return head;   // since after all the operations, now jead is conected tot he new sequence , so we just return hrad and others can be find by the connection. 
        
    }
    
}
