package linkedList;

public class leetcode141 {
    public static void main(String[] args){

    }

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

    public boolean hasCycle(ListNode head) {

        ListNode fast= head;
        ListNode slow= head;
        while(fast!= null && fast.next != null){ // means fast cant be null and at the last index. cuz last index meqans there is no cycle.
            fast=fast.next.next; 
            slow= slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }


// find the lenght of the cycle in the linked list.


    public int lengthCycle(ListNode head) {

        ListNode fast= head;
        ListNode slow= head;
        while(fast!= null && fast.next != null){ // means fast cant be null and at the last index. cuz last index meqans there is no cycle.
            fast=fast.next.next; 
            slow= slow.next;
            if(fast==slow){
                // calculate the length 
                ListNode temp= slow;
                int length=0;
                do{
                    temp= temp.next;
                    length++;
                } while(temp!= slow);
                return length;
            }
        }
        return 0;
    }


    
}

