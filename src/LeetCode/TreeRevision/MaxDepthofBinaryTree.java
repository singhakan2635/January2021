package LeetCode.TreeRevision;

public class MaxDepthofBinaryTree
{
    int max=0;
    public int maxDepth(TreeNode root)
    {
        if (root==null)
            return 0;
        helper(root);
        return max;
    }
    private int helper(TreeNode node)
    {
        if (node==null)
            return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        max = Math.max(max,Math.max(left,right)+1);
        return Math.max(left,right)+1;
    }
}
