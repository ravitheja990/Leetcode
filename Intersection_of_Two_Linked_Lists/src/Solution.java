public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        int lenA = 0, lenB = 0;
        ListNode tempA = headA, tempB = headB;

        while(tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while(tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        while(lenA > 0 && lenB > 0) {
            if(lenA == lenB) {
                if(tempA == tempB) return tempA;
                tempA = tempA.next;
                tempB = tempB.next;
                lenA--;
                lenB--;
            }else if(lenA > lenB) {
                while(lenA > lenB) {
                    tempA = tempA.next;
                    lenA--;
                }
            }else {
                while(lenB > lenA) {
                    tempB = tempB.next;
                    lenB--;
                }
            }
        }

        return null;
    }
}