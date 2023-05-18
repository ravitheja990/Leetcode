import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return root;
        boolean isOddLevel = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            TreeNode[] eachLevel = new TreeNode[size];
            int index = 0;

            while(size > 0) {
                TreeNode node = queue.remove();
                eachLevel[index++] = node;

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);

                size--;
            }

            if(isOddLevel) {
                for(int i=0,j=eachLevel.length-1;i<j;i++,j--) {
                    int temp = eachLevel[i].val;
                    eachLevel[i].val = eachLevel[j].val;
                    eachLevel[j].val = temp;
                }
            }

            isOddLevel = !isOddLevel;
        }

        return root;
    }
}
