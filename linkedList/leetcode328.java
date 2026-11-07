package linkedList;

public class leetcode328 {
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummyOdd= new ListNode();
        ListNode dummyEven= new ListNode();

        ListNode curr= head;
        ListNode next= curr.next;
        ListNode connectOdd= dummyOdd;
        ListNode connectEven= dummyEven;
        ListNode last=head;
        int i=0;
        while(last!=null){
            last= last.next;
            i++;
        }
        int j=0;

        while(j<i && curr !=null){
            if(j%2==0){
                connectOdd.next=curr;
                connectOdd=curr;
                connectOdd.next= null;
                j++;
            }
            else{
                connectEven.next=curr;
                connectEven=curr;
                connectEven.next= null;
                j++;
            }

            curr= next;
            if(next!=null){
                next= next.next;
            }

            
        }
        ListNode mainConnect= dummyEven.next;
        dummyEven.next= null;
        connectOdd.next=mainConnect;
        return dummyOdd.next;

        
        
    }
}
    
}
