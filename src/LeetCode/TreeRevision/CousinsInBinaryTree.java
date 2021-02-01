package LeetCode.TreeRevision;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree
{
    public boolean isCousins(TreeNode root, int x, int y)
    {
        if (root==null)
            return false;

        Queue<Pair> queue = new LinkedList<>();
        boolean foundx=false,foundy = false;
        TreeNode parentx = null, parenty = null;
        queue.offer(new Pair(root,null));
        while (!queue.isEmpty())
        {
            int size = queue.size();
            for (int i=0;i<size;i++)
            {
                Pair pair = queue.poll();
                TreeNode curr = pair.node;
                if (curr.val==x)
                {
                    foundx =true;
                    parentx = pair.parent;
                }
                if (curr.val==y)
                {
                    foundy=true;
                    parenty = pair.parent;
                }
                if (foundx && foundy && (parentx!=parenty))
                {
                    return true;
                }
                if (curr.left!=null)
                    queue.offer(new Pair(curr.left,curr));
                if (curr.right!=null)
                    queue.offer(new Pair(curr.right,curr));
            }
            foundx=foundy=false;
        }
        return false;
    }
    class Pair
    {
        TreeNode node;
        TreeNode parent;

        public Pair(TreeNode node, TreeNode parent) {
            this.node = node;
            this.parent = parent;
        }
    }
}
