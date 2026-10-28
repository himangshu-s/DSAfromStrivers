package linkedList;

public class leetcode876 {

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

    public ListNode middleNode(ListNode head) {
        // first we will find the lenght of the loinkedlist
        int length=0;
        ListNode temp= head;
        ListNode mid= head;
        int s=0;
      while(temp.next!=null){
            temp= temp.next;
            length++;
        } 

        int middle=0;
        if(length%2==0){
            middle=length/2;
        }else{
            middle= length/2 +1;
    }

        while(s!=middle){
            mid=mid.next;
            s++;
        }

        return mid;
        
    }

    // another approach is to use two pointer method where we will have a slow and fast pointer and the fast pointer will move two steps at a time and the slow pointer will move one step at a time and when the fast pointer reaches the end of the linked list then the slow pointer will be at the middle of the linked list.
public ListNode midNode(ListNode head) {}
 ListNode slow= head;
 ListNode fast= head;
 while(fast !=null && fast.next !=null){
    fast= fast.next.next;
    slow= slow.next;
 }
 return slow;
}
    

