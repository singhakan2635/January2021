package LeetCode.TreeRevision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryOrderLevelOrderTraversal2
{
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i=0;i<size;i++)
            {
                TreeNode curr = queue.poll();
                temp.add(curr.val);
                if (curr.left!=null)
                    queue.offer(curr.left);
                if (curr.right!=null)
                    queue.offer(curr.right);
            }
            res.add(0,temp);
        }
        return res;
    }

}
