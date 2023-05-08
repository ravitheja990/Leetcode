import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<DepthAndParentInfo> cousins;
    public boolean isCousins(TreeNode root, int x, int y) {
        cousins = new ArrayList<>();
        getCousins(root, x, y, 0, null);
        return ( (cousins.size() == 2) && (cousins.get(0).parent != cousins.get(1).parent)
                && (cousins.get(0).depth == cousins.get(1).depth) );
    }

    private void getCousins(TreeNode node, int x, int y, int depth, TreeNode parent) {
        if(node == null || cousins.size() == 2) return;

        if(node.val == x || node.val == y) {
            cousins.add(new DepthAndParentInfo(depth, parent));
            return;
        }

        getCousins(node.left, x, y, depth+1, node);
        getCousins(node.right, x, y, depth+1, node);
    }
}
