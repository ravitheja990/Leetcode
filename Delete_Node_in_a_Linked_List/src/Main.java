public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution solution = new Solution();
        solution.deleteNode(node2);

        while(node1 != null) {
            System.out.println("node val is :: " + node1.val);
            node1 = node1.next;
        }
    }
}