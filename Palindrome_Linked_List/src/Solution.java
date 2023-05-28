public class Solution {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode slow = head, fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverseList(slow);
        ListNode tmp = head;

        while(tmp != null && rev != null) {
            if(tmp.val != rev.val) return false;
            tmp = tmp.next;
            rev = rev.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
