package LeetCode.TreeRevision;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsDFS
{
    public List<String> binaryTreePaths(TreeNode root)
    {
        List<String> res= new ArrayList<>();
        if (root==null)
            return res;
        helper(root,""+root.val,res);
        return res;

    }
    private void helper(TreeNode node, String s,List<String> res)
    {

        if (node.left==null && node.right==null)
        {
            res.add(s);
        }
        if (node.left!=null)
        {
            helper(node.left,s+"->"+node.left.val,res);
        }
        if (node.right!=null)
        {
            helper(node.right,s+"->"+node.right.val,res);
        }
    }
}
