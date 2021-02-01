package LeetCode.TreeRevision;

public class MergeNodes
{
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2)
    {
        if (t1==null && t2==null)
            return null;
        if (t1==null)
            return t2;
        if (t2==null)
            return t1;
        return helper(t1,t2);

    }
    private TreeNode helper(TreeNode t1,TreeNode t2)
    {
        if (t1==null && t2==null)
            return null;
        if (t1!=null && t2==null)
            return t1;
        if (t2!=null && t1==null)
            return t2;
        t1.val +=t2.val;

        t1.left = helper(t1.left,t2.left);
        t1.right = helper(t1.right,t2.right);
        return t1;

    }
}
