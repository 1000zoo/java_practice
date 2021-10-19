//https://leetcode.com/problems/linked-list-cycle/submissions/
//2021-10-19

import java.util.HashSet;

public class Solution {
    class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }
     public boolean hasCycle(ListNode head){
         HashSet<ListNode> nodeSet = new HashSet<>();
         while(head != null){
             if(nodeSet.contains(head)){
                 return true;
             } else{
                 nodeSet.add(head);
                 head = head.next;
             }
         }
        return false;
     }
     public boolean faster(ListNode head){
        if(head == null) return false;
        ListNode jumper = head;
        while(jumper.next != null && jumper.next.next != null){
            if(head.next == jumper.next.next) return true;
            else {
                head = head.next;
                jumper = jumper.next.next;
            }
        }
        return false;
     }
}
