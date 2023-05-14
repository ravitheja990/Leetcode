import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int  deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            sum = 0;
            while(size > 0) {
                TreeNode node = queue.remove();
                sum += node.val;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                size--;
            }
        }

        return sum;
    }
}
