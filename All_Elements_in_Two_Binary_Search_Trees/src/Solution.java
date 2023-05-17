import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> inorder1 = new ArrayList<>();
        List<Integer> inorder2 = new ArrayList<>();
        inorder(root1, inorder1);
        inorder(root2, inorder2);
        return mergeLists(inorder1, inorder2);
    }

    private void inorder(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorder(node.left, inorder);
        inorder.add(node.val);
        inorder(node.right, inorder);
    }

    private List<Integer> mergeLists(List<Integer> inorder1, List<Integer> inorder2) {
        List<Integer> sortedList = new ArrayList<>();
        int n = inorder1.size();
        int m = inorder2.size();

        int i=0, j=0;

        while(i < n && j < m) {
            if(inorder1.get(i) <= inorder2.get(j)) {
                sortedList.add(inorder1.get(i));
                i++;
            }else {
                sortedList.add(inorder2.get(j));
                j++;
            }
        }

        while(i < n) {
            sortedList.add(inorder1.get(i++));
        }

        while(j < m) {
            sortedList.add(inorder2.get(j++));
        }

        return sortedList;
    }

}