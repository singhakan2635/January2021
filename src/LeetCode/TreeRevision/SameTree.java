package LeetCode.TreeRevision;

public class SameTree
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        return helper(p,q);
    }
    private boolean helper(TreeNode p,TreeNode q)
    {
        if (p==null && q==null)
            return true;
        if (p==null || q==null)
            return false;
        if (p.val==q.val)
            return true;
        return helper(p.left,q.left) && helper(p.right,q.right);
    }
}
