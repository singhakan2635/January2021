package LeetCode.TreeRevision;

public class SumRootToLeaf
{
    int sum=0;
    public int sumRootToLeaf(TreeNode root)
    {
        if (root==null)
            return 0;
        helper(root,""+root.val);
        return sum;
    }
    private void helper(TreeNode node, String s)
    {
        if (node.left==null && node.right==null)
        {
            sum += convertBinary(s);
        }
        if (node.left!=null)
            helper(node.left,s+node.left.val);
        if (node.right!=null)
            helper(node.right,s+node.right.val);
    }
    private int convertBinary(String s)
    {
        int dec = 0;
        int base =1;
       for (int i=s.length()-1;i>=0;i--)
       {
           if (s.charAt(i)=='1')
           {
               dec +=base;
           }
           base *=2;
       }
       return dec;

    }
}
