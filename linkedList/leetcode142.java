package linkedList;

public class leetcode142 {
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    public ListNode detectCycle(ListNode head) {
        int length= 0;
        ListNode fast= head;
        ListNode slow= head;
        while(fast!= null && fast.next !=null){
            fast= fast.next.next;
            slow= slow.next;
            if(fast==slow){
                ListNode temp= slow;
                do{
                    temp= temp.next;
                    length++;
                }while(temp!= slow);
                break;
                
            }

        }
        if(length==0){
            return null;
        }



        // now move the second pointer
        ListNode s= head;
        ListNode f= head;
        while(length >0){
            s= s.next;
            length--;
        }
        // now move the first and second pointer
        while(f!= s){
            f=f.next;
            s= s.next;
        }


        return s ;
    }
}
    

