import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> binaryTreePaths = new ArrayList<>();
        generateAllBinaryTreePaths(root, "", binaryTreePaths);
        return binaryTreePaths;
    }
    private void generateAllBinaryTreePaths(TreeNode node, String s, List<String> binaryTreePaths) {
        if(node == null) return;
        s += node.val;
        if(node.left == null && node.right == null) {
            binaryTreePaths.add(s);
        }
        generateAllBinaryTreePaths(node.left, s + "->", binaryTreePaths);
        generateAllBinaryTreePaths(node.right, s + "->", binaryTreePaths);
    }
}
