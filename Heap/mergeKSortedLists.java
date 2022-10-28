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
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<Integer>list=new ArrayList<>();

        for(ListNode h:lists){
            while(h!=null){
                list.add(h.val);
                h=h.next;
            }
        }

        Collections.sort(list);

        ListNode head=new ListNode(0);

        ListNode ptr=head;

        for(int i:list){
            ListNode nn=new ListNode(i);
            ptr.next=nn;
            ptr=ptr.next;
        }

        return head.next;
    }
}
