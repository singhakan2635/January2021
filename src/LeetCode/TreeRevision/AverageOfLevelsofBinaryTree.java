package LeetCode.TreeRevision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsofBinaryTree
{
    public List<Double> averageOfLevels(TreeNode root)
    {
        List<Double> res = new ArrayList<>();
        if (root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            double average=0.0;
            double sum =0.0;
            for (int i=0;i<size;i++)
            {
                TreeNode curr = queue.poll();
                sum += curr.val;
                if (curr.left!=null)
                    queue.offer(curr.left);
                if (curr.right!=null)
                    queue.offer(curr.right);
            }
            average = (double)sum/size;
            res.add(average);
        }
        return res;
    }
}
