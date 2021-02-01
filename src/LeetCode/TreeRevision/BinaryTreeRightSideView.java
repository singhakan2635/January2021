package LeetCode.TreeRevision;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView
{
    int max=-1;
    public List<Integer> rightSideView(TreeNode root)
    {
        List<Integer> res = new ArrayList<>();
        if (root==null)
            return res;
        res.add(root.val);
        helper(root,1,res);
        return res;

    }
    private void helper(TreeNode node, int depth,List<Integer> res)
    {
        if (node==null)
            return;
        if (node.right!=null && depth>max)
        {
            res.add(node.right.val);
            max = Math.max(depth,max);
        }
        if (node.right==null && node.left!=null && depth>max)
        {
            res.add(node.left.val);
            max = Math.max(depth,max);
        }
        if (node.right!=null)
        {
            helper(node.right,depth+1,res);
        }
        if (node.left!=null)
        {
            helper(node.left,depth+1,res);
        }
    }
}
