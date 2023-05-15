public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(9);
        TreeNode node9 = new TreeNode(1);
        TreeNode node10 = new TreeNode(4);
        TreeNode node11 = new TreeNode(5);
        
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node5.left = node9;
        node5.right = node10;
        node7.right = node11;

        Solution solution = new Solution();
        System.out.println("sum of all nodes with even valued grandparent is :: " + solution.sumEvenGrandparent(node1));



    }
}