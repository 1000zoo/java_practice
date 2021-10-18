//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int getDecimalValue(ListNode head){
        int answer = 0;
        while(head != null){
            if(head.next != null) answer = (answer + head.val) * 2;
            else answer = answer + head.val;
            head = head.next;
        }
        return answer;
    }
    /*
    *if we use reflection, memory usage will be reduced
    * public int getDecimalValue(ListNode head){
        if (head.next != null) {
            return (head.val + getDecimalValue(head.next)) * 2;
        } else {
            return head.val;
        }
    }
    * */
}
