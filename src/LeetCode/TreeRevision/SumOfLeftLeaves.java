package LeetCode.TreeRevision;

public class SumOfLeftLeaves
{
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root)
    {
        if (root==null)
            return sum;
        helper(root);
        return sum;

    }
    private void helper(TreeNode node)
    {
        if (node==null)
            return;
        if (node.left!=null && isLeaf(node.left))
            sum+=node.left.val;
        helper(node.left);
        helper(node.right);

    }
    private boolean isLeaf(TreeNode node)
    {
        return node.left==null && node.right==null;
    }
}
