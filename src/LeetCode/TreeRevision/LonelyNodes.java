package LeetCode.TreeRevision;

import java.util.ArrayList;
import java.util.List;

public class LonelyNodes
{
    public List<Integer> getLonelyNodes(TreeNode root)
    {
        List<Integer> res= new ArrayList<>();
        if (root==null)
            return res;
        helper(root,res);
        return res;

    }
    private void helper(TreeNode node,List<Integer> res)
    {
        if (node.left==null && node.right==null)
            return;
        if (node.left!=null && node.right==null)
            res.add(node.left.val);
        if (node.right!=null && node.left==null)
            res.add(node.right.val);
        if (node.left!=null)
            helper(node.left,res);
        if (node.right!=null)
            helper(node.right,res);
    }
}
