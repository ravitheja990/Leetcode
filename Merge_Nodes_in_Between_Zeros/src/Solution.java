public class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode outputPreHead = new ListNode();
        ListNode temp = outputPreHead;

        head = head.next;

        while(head != null) {
            if(head.val == 0) {
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;
        }

        return outputPreHead.next;
    }
}
