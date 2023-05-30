class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodeA = list1;
        ListNode nodeB = list1;

        for(int i=0;i<a-1;i++) {
            nodeA = nodeA.next;
        }

        nodeA.next = list2;

        for(int i=0;i<b;i++) {
            nodeB = nodeB.next;
        }

        ListNode temp = list2;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = nodeB;
        nodeB.next = null;

        return list1;
    }
}