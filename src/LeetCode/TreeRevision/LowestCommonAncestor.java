package LeetCode.TreeRevision;

public class LowestCommonAncestor
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        return helper(root,p,q);
    }
    private TreeNode helper(TreeNode root,TreeNode p, TreeNode q)
    {
        if (root==null)
            return null;
        if (root==p || root==q)
            return root;

        TreeNode left = helper(root.left,p,q);
        TreeNode right = helper(root.right,p,q);
        if (left!=null && right!=null) return root;
        if (left==null && right==null) return null;

        return right==null?left:right;
    }
}
