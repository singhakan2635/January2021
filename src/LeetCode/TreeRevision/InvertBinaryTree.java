package LeetCode.TreeRevision;

public class InvertBinaryTree
{
    public TreeNode invertTree(TreeNode root)
    {
        if (root==null)
            return null;
        return helper(root);

    }
    private TreeNode helper(TreeNode node)
    {
        if (node==null)
            return null;

        TreeNode temp = new TreeNode(node.val);
        temp.left = helper(node.right);
        temp.right = helper(node.left);
        return temp;
    }

}
