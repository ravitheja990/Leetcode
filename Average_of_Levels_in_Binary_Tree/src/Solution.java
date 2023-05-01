import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> levelOrderAverages = new ArrayList<>();
        if(root == null) return levelOrderAverages;
        LinkedList<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.add(root);

        while(!levelQueue.isEmpty()) {
            int size = levelQueue.size();
            long levelSum = 0;

            for(int i=0;i<size;i++) {
                TreeNode tempNode = levelQueue.remove();
                levelSum += tempNode.val;

                if(tempNode.left != null) {
                    levelQueue.add(tempNode.left);
                }
                if(tempNode.right != null) {
                    levelQueue.add(tempNode.right);
                }
            }

            levelOrderAverages.add( (double) levelSum / (double) size );
        }

        return levelOrderAverages;
    }

}
