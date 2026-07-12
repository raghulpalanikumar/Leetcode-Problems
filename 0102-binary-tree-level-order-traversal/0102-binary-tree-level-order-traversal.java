class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> l = new ArrayList<>();

        if(root == null)
            return l;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                level.add(curr.val);

                if(curr.left != null)
                    q.add(curr.left);

                if(curr.right != null)
                    q.add(curr.right);
            }

            l.add(level);
        }

        return l;
    }
}