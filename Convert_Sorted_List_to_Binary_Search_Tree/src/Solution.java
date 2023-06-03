import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        return constructBST(list, 0, list.size()-1);
    }

    private TreeNode constructBST(List<Integer> list, int start, int end) {
        if(start > end) return null;

        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = constructBST(list, start, mid-1);
        root.right = constructBST(list, mid+1, end);

        return root;
    }
}
