import java.util.Stack;

public class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while(temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        temp = null;
        int maxVal = 0;

        while(!stack.isEmpty()) {
            ListNode node = stack.pop();
            if(node.val >= maxVal) {
                maxVal = node.val;
                node.next = temp;
                temp = node;
            }
        }

        return temp;
    }
}
