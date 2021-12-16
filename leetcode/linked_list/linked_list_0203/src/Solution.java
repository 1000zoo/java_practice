//https://leetcode.com/problems/remove-linked-list-elements/submissions/
//2021-12-16

public class Solution {

<<<<<<< HEAD
    //Runtime: 1 ms, faster than 74.30% of Java online submissions for Remove Linked List Elements.
    //Memory Usage: 46.3 MB, less than 5.26% of Java online submissions for Remove Linked List Elements.
=======
>>>>>>> origin/master
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode curr = dummy;
        while(curr.next != null){
            if(curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return dummy.next;
    }
}
