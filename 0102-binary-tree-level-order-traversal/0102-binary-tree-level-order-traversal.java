/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> l = new ArrayList<>();
    if(root==null)
    {
        return l;
    }
    Queue<TreeNode> a = new LinkedList<>();
    a.add(root);
    while(!a.isEmpty())
    {
        int siz=a.size();
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<siz;i++)
        {
        TreeNode t = a.poll();
        ls.add(t.val);
        if(t.left!=null)
        {
            a.add(t.left);
        }
        if(t.right!=null)
        {
            a.add(t.right);
        }
        }
        l.add(ls);
    }
    return l;
    }
}