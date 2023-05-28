public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution solution = new Solution();
        System.out.println("maxTwinSum in given list is :: " + solution.pairSum(node1));
    }
}