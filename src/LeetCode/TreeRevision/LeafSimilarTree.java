package LeetCode.TreeRevision;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree
{
    public boolean leafSimilar(TreeNode root1, TreeNode root2)
    {
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();
        helper(root1,t1);
        helper(root2,t2);
        if (t1.size()!=t2.size())
            return false;
        for (int i=0;i<t1.size();i++)
        {
            if (t1.get(i)!=t2.get(i))
                return false;
        }
        return true;


    }
    private void helper(TreeNode node,List<Integer> ls)
    {
        if (node==null)
            return;
        if (node.left==null && node.right==null)
            ls.add(node.val);
        helper(node.left,ls);
        helper(node.right,ls);
    }
}
