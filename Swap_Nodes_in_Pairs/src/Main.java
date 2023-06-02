public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution solution = new Solution();
        ListNode head = solution.swapPairs(node1);

        while(head != null) {
            System.out.println("val is :: " + head.val);
            head = head.next;
        }
    }
}