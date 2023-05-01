import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        generateLeafSequence(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        generateLeafSequence(root2, list2);
        return list1.equals(list2);
    }

    private void generateLeafSequence(TreeNode node, List<Integer> list) {
        if(node == null) return;
        if(node.left == null && node.right == null) list.add(node.val);
        generateLeafSequence(node.left, list);
        generateLeafSequence(node.right, list);
    }
}
