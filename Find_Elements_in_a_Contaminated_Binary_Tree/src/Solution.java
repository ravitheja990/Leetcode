import java.util.HashSet;
import java.util.Set;

public class Solution {
    TreeNode treeRoot;
    Set<Integer> set;
    public Solution(TreeNode root) {
        treeRoot = root;
        treeRoot.val = 0;
        set = new HashSet<>();
        set.add(0);
        purifyTree(treeRoot);
    }
    private void purifyTree(TreeNode node) {
        if(node == null) return;
        if(node.left != null) {
            node.left.val = 2 * node.val + 1;
            set.add(node.left.val);
        }
        if(node.right != null) {
            node.right.val = 2 * node.val + 1;
            set.add(node.right.val);
        }
        purifyTree(node.left);
        purifyTree(node.right);
    }
    public boolean find(int target) {
        return set.contains(target);
    }
}
