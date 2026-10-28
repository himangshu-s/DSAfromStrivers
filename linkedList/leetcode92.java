package linkedList;

public class leetcode92 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left== right){
            return head;

        }

        ListNode curr= head;
        ListNode prev= null;
        ListNode next= curr.next;

        for(int i=1;curr!=null && i<left; i++){
            prev= curr;
            curr= curr.next;


        }
        next= curr.next;
        ListNode last= prev;
        ListNode lastNode = curr;
        for(int i=0; curr!= null && i<right-left+1;i++){
            curr.next= prev;
            prev= curr;
            curr= next;
            if(next!= null){
            next= next.next;}


            
        }
  
            lastNode.next= curr;
       
        if(last!=null){
            last.next=prev;
        } else{
            head= prev;
        }

        return head;
        
    }
}
    
}
