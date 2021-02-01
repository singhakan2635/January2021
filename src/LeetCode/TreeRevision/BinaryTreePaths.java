package LeetCode.TreeRevision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreePaths
{
    public List<String> binaryTreePaths(TreeNode root)
    {
        List<String> res= new ArrayList<>();
        if (root==null)
            return res;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,""+root.val));
        while (!queue.isEmpty())
        {
            Pair pair = queue.poll();
            if (pair.node.left==null && pair.node.right==null)
                res.add(pair.s);
            if (pair.node.left!=null)
            {
                queue.offer(new Pair(pair.node.left, pair.s+"->"+pair.node.left.val));
            }
            if (pair.node.right!=null)
            {
                queue.offer(new Pair(pair.node.right, pair.s+"->"+pair.node.right.val));
            }

        }
        return res;
    }
    class Pair
    {
        TreeNode node;
        String s;

        public Pair(TreeNode node, String s) {
            this.node = node;
            this.s = s;
        }
    }
}
