import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};

        Solution solution = new Solution();
        TreeNode root = solution.sortedArrayBST(nums);

        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        System.out.println("inorder of output tree is :: " + inorder);
    }

    private static void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}