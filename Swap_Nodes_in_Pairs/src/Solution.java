public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode preHead = new ListNode(0);
        ListNode prev = head, curr = head;

        while(curr != null && curr.next != null) {
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = curr;
            prev = curr;
            curr = curr.next;
        }

        return preHead.next;
    }
}
