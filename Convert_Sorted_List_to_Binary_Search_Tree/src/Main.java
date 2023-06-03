import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-10);
        ListNode node2 = new ListNode(-3);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Solution solution = new Solution();
        TreeNode root = solution.sortedListToBST(node1);

        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        System.out.println("inorder is :: " + inorder);
    }

    private static void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}