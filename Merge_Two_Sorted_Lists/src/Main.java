public class Main {
    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(1);
        ListNode list1Node2 = new ListNode(2);
        ListNode list1Node3 = new ListNode(4);

        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;

        ListNode list2Node1 = new ListNode(1);
        ListNode list2Node2 = new ListNode(3);
        ListNode list2Node3 = new ListNode(4);

        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;

        Solution solution = new Solution();
        ListNode outputNode = solution.mergeTwoLists(list1Node1, list2Node1);
        
        while(outputNode != null) {
            System.out.println("outputNode val is :: " + outputNode.val);
            outputNode = outputNode.next;
        }
    }
}