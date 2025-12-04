class Solution {
    int diameter = 0;  // stores the maximum diameter found

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);   // call helper to calculate heights and update diameter
        return diameter;
    }

    private int height(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Diameter through this node = leftHeight + rightHeight
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height of current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
