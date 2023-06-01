public class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode kthNodeFromStart = getKthNodeFromStart(head, k);
        ListNode kthNodeFromEnd = getKthNodeFromEnd(head, k);

        int temp = kthNodeFromStart.val;
        kthNodeFromStart.val = kthNodeFromEnd.val;
        kthNodeFromEnd.val = temp;

        return head;
    }

    private ListNode getKthNodeFromStart(ListNode head, int index) {
        ListNode temp = head;
        for(int i=1;i<index;i++) {
            temp = temp.next;
        }

        return temp;
    }

    private ListNode getKthNodeFromEnd(ListNode head, int index) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=0;i<index;i++) {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }


}
