class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            int currSum = val1 + val2 + carry;
            curr.next = new ListNode(currSum % 10);
            curr = curr.next;
            carry = currSum / 10;

            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        if(carry == 1) {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }


    //can't use when number > 2^31 - 1
    public ListNode none(ListNode l1, ListNode l2) {
        return reverseIntToList(reverseListToInt(l1) + reverseListToInt(l2));
    }

    private int reverseListToInt(ListNode l1) {
        int sum = 0;
        int poss = 0;
        while(l1 != null) {
            sum += l1.val*Math.pow(10, poss++);
            l1 = l1.next;
        }
        return sum;
    }

    private ListNode reverseIntToList(int num) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(num > 0) {
            curr.next = new ListNode(num % 10);
            num /= 10;
            curr = curr.next;
        }
        return dummy.next;
    }
}