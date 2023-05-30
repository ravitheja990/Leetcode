class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        ListNode list1 = createLinkedList(new int[]{0, 1, 2, 3, 4, 5});
        ListNode list2 = createLinkedList(new int[]{100, 101, 102});
        int a = 2;
        int b = 4;
        ListNode expectedResult = createLinkedList(new int[]{0, 1, 100, 101, 102, 5});
        testMergeInBetween(solution, list1, a, b, list2, expectedResult);

        // Test Case 2
        list1 = createLinkedList(new int[]{10, 20, 30, 40, 50});
        list2 = createLinkedList(new int[]{100, 200, 300, 400});
        a = 1;
        b = 3;
        expectedResult = createLinkedList(new int[]{10, 100, 200, 300, 400, 40, 50});
        testMergeInBetween(solution, list1, a, b, list2, expectedResult);

        // Test Case 3
        list1 = createLinkedList(new int[]{1, 2, 3, 4, 5});
        list2 = createLinkedList(new int[]{10, 20, 30, 40, 50});
        a = 0;
        b = 4;
        expectedResult = createLinkedList(new int[]{10, 20, 30, 40, 50});
        testMergeInBetween(solution, list1, a, b, list2, expectedResult);
    }

    private static void testMergeInBetween(Solution solution, ListNode list1, int a, int b, ListNode list2, ListNode expectedResult) {
        ListNode result = solution.mergeInBetween(list1, a, b, list2);
        boolean isEqual = compareLinkedLists(result, expectedResult);
        System.out.println("Expected: " + listToString(expectedResult));
        System.out.println("Result:   " + listToString(result));
        System.out.println("Pass:     " + isEqual);
        System.out.println("--------------------------------------");
    }

    private static ListNode createLinkedList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    private static boolean compareLinkedLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    private static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" -> ");
            head = head.next;
        }
        sb.append("null");
        return sb.toString();
    }
}