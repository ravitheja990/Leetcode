public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;

        Solution solution = new Solution();
        ListNode outputHead = solution.deleteDuplicates(node1);

        while (outputHead != null) {
            System.out.println("output node val is :: " + outputHead.val);
            outputHead = outputHead.next;
        }
    }
}