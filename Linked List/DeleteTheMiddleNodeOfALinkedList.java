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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next==null){
            return null;
        }
        ListNode temp=head;
        int ind=0;

        int pos=0;
        int totcount=0;

        while(temp!=null){
            totcount++;
            temp=temp.next;
        }

        pos=totcount/2;

        temp=head;
        ListNode prev=null;

        while(temp!=null && ind!=pos){
            prev=temp;
            ind++;
            temp=temp.next;
        }

        prev.next=temp.next;
        return head;
    }
}
