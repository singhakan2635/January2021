package LeetCode.TreeRevision;

public class PathSum
{
    public boolean hasPathSum(TreeNode root, int targetSum)
    {
        if (root==null)
            return false;
        return helper(root,targetSum);
    }
    private boolean helper(TreeNode node,int sum)
    {
        if (node!=null)
        {
            if (node.left==null && node.right==null)
            {
                if (sum-node.val==0)
                    return true;

            }
            sum -=node.val;
            return helper(node.left,sum) || helper(node.right,sum);

        }
        return false;
    }
}
