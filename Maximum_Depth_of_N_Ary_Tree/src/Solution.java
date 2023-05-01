public class Solution {
    public int maxDepth(Node node) {
        if(node == null) return 0;
        if(node.children.size() == 0) return 1;

        int max = 0;
        for(Node child: node.children) {
            max = Math.max(max, maxDepth(child));
        }
        return 1+max;
    }
}
