public class Main {
    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(4);
        ListNode list1Node2 = new ListNode(1);

        list1Node1.next = list1Node2;

        ListNode list2Node1 = new ListNode(5);
        ListNode list2Node2 = new ListNode(6);
        ListNode list2Node3 = new ListNode(1);

        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;

        ListNode commonNode1 = new ListNode(8);
        ListNode commonNode2 = new ListNode(4);
        ListNode commonNode3 = new ListNode(5);

        commonNode1.next = commonNode2;
        commonNode2.next = commonNode3;

        list1Node2.next = commonNode1;
        list2Node3.next = commonNode1;

        Solution solution = new Solution();
        System.out.println("common node value is :: " + solution.getIntersectionNode(list1Node1, list2Node1).val);
    }
}