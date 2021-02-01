package LeetCode.TreeRevision;

public class CousinsInBinaryTreeDFS
{
    Var[] vars;
    public boolean isCousins(TreeNode root, int x, int y)
    {
        if (root==null)
            return false;
        vars = new Var[2];

        helper(root,0,null,x,y);
        if (vars[0].depth!=vars[1].depth)
            return false;
        if (vars[0].parent==vars[1].parent)
            return false;
        return true;

    }
    private void helper(TreeNode node, int depth, TreeNode parent,int x, int y)
    {
        if (node==null)
            return;
        if (node.val==x)
        {
            vars[0] = new Var(parent,depth);

        }
        if (node.val==y)
        {
            vars[1] = new Var(parent,depth);
        }
        helper(node.left,depth+1,node,x,y);
        helper(node.right,depth+1,node,x,y);
    }
    class Var
    {
        TreeNode parent;
        int depth;

        public Var(TreeNode parent, int depth) {
            this.parent = parent;
            this.depth = depth;
        }
    }

}
