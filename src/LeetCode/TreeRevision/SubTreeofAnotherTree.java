package LeetCode.TreeRevision;

public class SubTreeofAnotherTree
{
    public boolean isSubtree(TreeNode s, TreeNode t)
    {
        if (t==null) return true;
        if (s==null) return false;
        return helper(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    private boolean helper(TreeNode s,TreeNode t)
    {
        if (s==null && t==null)
            return true;
        if (s==null || t==null)
            return false;
        if (s.val!=t.val)
            return false;

        return helper(s.left,t.left) && helper(s.right,t.right);
    }
}
