import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer> inorder = new ArrayList<>();
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        Solution solution = new Solution();
        TreeNode root = solution.bstFromPreorder(preorder);
        inorder(root);
        System.out.println("inorder of resulting bst is :: " + inorder);
    }
    private static void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        inorder.add(node.val);
        inorder(node.right);
    }
}