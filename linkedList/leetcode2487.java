package linkedList;

public class leetcode2487 {
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
    public ListNode removeNodes(ListNode head) {
        ListNode curr= head;
        ListNode dummyHead= new ListNode();
        ListNode connect= dummyHead;
        while(curr!=null){
            ListNode next= curr.next;
            ListNode compare= curr;
            Boolean hasGreater=false;
            while(compare!=null){
                 if(curr.val<compare.val){
                    hasGreater= true;
                    break;
                }
                compare=compare.next;
                }
                if(!hasGreater){
                    connect.next= curr;
                    connect= curr;
                    connect.next=null;
                    

                }
                curr= next;

        }
        return dummyHead.next;
        
    }
} // this is although correct but it will throw TLE.    
}
