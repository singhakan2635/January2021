package LeetCode.TreeRevision;

public class DiameterOfTree
{
    int max;
    public int diameterOfBinaryTree(TreeNode root)
    {
        max=0;
        if (root==null)
            return max;
        return helper(root);

    }
    private int helper(TreeNode node)
    {
        if (node==null)
            return 0;
        if (node.left==null && node.right==null)
            return 1;
        int left = helper(node.left);
        int right = helper(node.right);
        max = Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}
