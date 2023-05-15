import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer> inorder = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        Solution solution = new Solution();
        TreeNode root = solution.constructMaximumBinaryTree(nums);
        inorder(root);
        System.out.println("inorder of output tree is :: " + inorder);
    }
    private static void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        inorder.add(node.val);
        inorder(node.right);
    }
}