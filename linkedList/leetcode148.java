package linkedList;

public class leetcode148 {
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode fast=head, slow=head, prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        return mergeTwoLists(left, right);

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode curr=l3;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if(l1!=null)
            curr.next=l1;
        if(l2!=null)
            curr.next=l2;
        return l3.next;
        
    }

}
    // by bubble sort
    public ListNode sortList(ListNode head){
        if(head==nuull || head.next== null){
            return head;
        }

        for(ListNode i= head; i != null; i=i.next){
            for(ListNode j= head; j.next != null ; j= j.next){
                if(j.val >j.next.val){
                    int temp= j.val;
                    j.val= j.next.val;
                    j.next.val= temp;

                }
            }
        }
    }
}
