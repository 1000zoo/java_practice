//https://leetcode.com/problems/middle-of-the-linked-list/


import java.util.ArrayList;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;

        ArrayList<Integer> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head.val);
            head = head.next;
        }
        ListNode curr = new ListNode();
        ListNode answer = new ListNode();
        answer = curr;

        for (int i = nodes.size() / 2; i < nodes.size(); i++) {
            ListNode temp = new ListNode(nodes.get(i));
            curr.next = temp;
            curr = curr.next;
        }
        return answer.next;
    }

/* using reverseList function but failed.
    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        if(head.next.next == null) return head.next;
        ListNode backup = head;
        ListNode rev = reverseList(head);
        head = backup;

        while(head != rev){
            if(head.next == rev) return head.next;
            head = head.next;
            rev = rev.next;
        }

        return head;
    }
    public ListNode reverseList(ListNode head) {
        ListNode nextNode = head;
        ListNode currentNode = null;
        ListNode preNode = null;

        while (nextNode != null) {
            preNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
            currentNode.next = preNode;
        }
        head = currentNode;
        return head;
    }
* */
}
