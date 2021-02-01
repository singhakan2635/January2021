package LeetCode.TreeRevision;

public class SecondMinimumNode
{
    public int findSecondMinimumValue(TreeNode root)
    {
        if (root==null)
            return -1;
        int[] arr = new int[2];
        arr[0] = root.val;
        arr[1] = -1;
        helper(root,arr);
        return arr[1];

    }
    private void helper(TreeNode node, int[] arr)
    {
        if (node==null)
            return;
        if (node.val<arr[0])
            arr[0]=node.val;
        else if (node.val>arr[0] && (arr[1]<0 || node.val<arr[1]))
        {
            arr[1] = node.val;
        }
        helper(node.left,arr);
        helper(node.right,arr);
    }
}
