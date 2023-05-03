import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        int i=0, j=inorder.size()-1;
        while(i < j) {
            int iVal = inorder.get(i);
            int jVal = inorder.get(j);
            if(iVal + jVal == k) return true;
            if(iVal + jVal > k) j--;
            else i++;
        }

        return false;
    }

    private void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }
}
