/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializePreorder(root, sb);
        return sb.toString();
    }
    
    private void serializePreorder(TreeNode node, StringBuilder sb) {
        if(node == null) {
            sb.append("null,");
            return;
        }
        sb.append(node.val+",");
        serializePreorder(node.left, sb);
        serializePreorder(node.right, sb);    
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return deserializePreorder(arr);
    }
    
    private int index = 0;
    
    private TreeNode deserializePreorder(String[] arr) {
        if(index >= arr.length || arr[index].equals("null")) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(arr[index++]));
        node.left = deserializePreorder(arr);
        node.right = deserializePreorder(arr);
        
        return node;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
