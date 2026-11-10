package linkedList;

public class leetcode460 {
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1.next==null && l2.next==null){
            
        }


        ListNode lastOne=l1;
        ListNode lastTwo=l2;
        ListNode dummy= new ListNode();
        ListNode curr= dummy;
        int list1=0;
        int list2=0;
        while(lastOne!=null){
            list1=list1*10+lastOne.val;
            lastOne=lastOne.next;
             }

             while(lastTwo!=null){
                list2=list2*10+lastTwo.val;
                lastTwo=lastTwo.next;
             }


             int sum= list1+list2;

             while(sum!=0){
                int rem= sum%10;
                sum= sum/10;
                ListNode newNode= new ListNode(rem, null);
                curr.next=newNode;
                curr= newNode;

             }
             // now reverse it
             ListNode maincurr= dummy.next;
             ListNode prev= null;
             dummy.next= null;
             ListNode next= maincurr;
             while(maincurr!=null){
                if(next!=null){
                    next=maincurr.next;
                }

                maincurr.next=prev;
                prev=maincurr;
                maincurr=next;
                
             }


             
            
return prev;

        
    }
}

// we cant use thie methde cuz , the toal no of nodes is 1to 100 , and java int cant handle such huge numbers , imagne a number which have total of 99 digits in it. 
// so we will sue stack.
    
}
