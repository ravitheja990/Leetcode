public class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder binaryString = new StringBuilder();

        while(head != null) {
            binaryString.append(head.val);
            head = head.next;
        }

        return getIntegerFromBinaryString(binaryString.toString());
    }
    private int getIntegerFromBinaryString(String binaryString) {
        return Integer.parseInt(binaryString,2);
    }
}


