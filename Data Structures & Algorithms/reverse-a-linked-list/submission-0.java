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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        
        Deque<ListNode> stack = new ArrayDeque<>();
        stack.push(head);

        while (head.next != null) {
            stack.push(head.next);
            head = head.next;
        }

        ListNode newHead = stack.peek();
        while (!stack.isEmpty()) {
            ListNode current = stack.pop();
            current.next = stack.peek();
        }

        return newHead;
    }
}

           