//https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head;
        ListNode curr = head;
        while(head != null){
            if(curr.next == null && head.val != curr.val){
                if(head.val != curr.val){
                    head.next = curr;
                    break;
                } else{
                    head.next = null;
                    break;
                }
            }
            if(head.val != curr.val) {
                head.next = curr;
                head = head.next;
            }
            curr = curr.next;
        }
        return dummy;
    }
}
