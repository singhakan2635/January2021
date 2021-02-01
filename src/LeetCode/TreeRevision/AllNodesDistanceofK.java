package LeetCode.TreeRevision;

import java.util.*;

public class AllNodesDistanceofK
{
    Map<TreeNode,List<TreeNode>> map;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K)
    {
        map=new HashMap<>();
        createGraph(root,null);
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);
        while (!queue.isEmpty())
        {
            if (K==0)
            {
                while (!queue.isEmpty())
                {
                    TreeNode node = queue.poll();
                    res.add(node.val);
                }
                return res;
            }
            int size = queue.size();

                for (int i=0;i<size;i++)
                {
                    TreeNode temp = queue.poll();
                    for (TreeNode node: map.get(temp))
                    {
                        if (!visited.contains(node))
                        {
                            queue.offer(node);
                            visited.add(node);
                        }
                    }
                }
            K--;



        }
        return res;

    }
    private void createGraph(TreeNode root,TreeNode parent)
    {
        if (root!=null)
        {
            if (!map.containsKey(root))
            {
                map.put(root,new ArrayList<>());
                if (parent!=null)
                {
                    map.get(root).add(parent);
                    map.get(parent).add(root);
                }
            }
            createGraph(root.left,root);
            createGraph(root.right,root);
        }
    }
}
