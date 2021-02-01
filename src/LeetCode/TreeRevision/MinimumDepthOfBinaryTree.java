package LeetCode.TreeRevision;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree
{
    public int minDepth(TreeNode root)
    {
        if (root==null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 1;
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            for (int i=0;i<size;i++)
            {
                TreeNode curr = queue.poll();
                if (curr.left==null && curr.right==null)
                    return depth;
                if (curr.left!=null)
                    queue.offer(curr.left);
                if (curr.right!=null)
                    queue.offer(curr.right);
            }
            depth++;
        }
        return -1;

    }
    public int minDepth2(TreeNode root)
    {
        if (root==null)
            return 0;
        return helper(root);

    }
    private int helper(TreeNode node)
    {
        if (node==null)
            return 0;
        if (node.left==null && node.right==null)
            return 1;
        int minDepth=Integer.MAX_VALUE;
        if (node.left!=null)
            minDepth = Math.min(helper(node.left)+1,minDepth);
        if (node.right!=null)
            minDepth = Math.min(helper(node.right)+1,minDepth);
        return minDepth;
    }

}
