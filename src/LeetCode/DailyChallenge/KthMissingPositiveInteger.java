package LeetCode.DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class KthMissingPositiveInteger
{
    public int findKthPositive(int[] arr, int k)
    {
        if (arr.length==0)
            return 0;
        int end = arr[arr.length-1];
        if (end == arr.length)
            return helper1(arr,k,end);
        else
            return helper2(arr,k,end);

    }
    private int helper1(int[] arr,int k,int end)
    {
        while(k-->0)
        {
            end++;
        }
        return end;
    }
    private int helper2(int[] arr,int k,int end)
    {
        List<Integer> list = new ArrayList<>();
        int i=1,j=0;
        while (i<=end && j<arr.length)
        {
            if (arr[j]==i)
            {
                j++;
                i++;
            }
            else
            {
                list.add(i);
                i++;
            }
        }
        if (list.size()>k)
        {
            return list.get(k);
        }
        return end+k;
    }

    public int findKthPositive1(int[] arr, int k)
    {
        List<Integer> list = new ArrayList<>();
        int i=1,j=0;
        int end=0;
        while (k>0 && j<arr.length)
        {
            if (arr[j]==i)
            {
                end = Math.max(arr[j],end);
                j++;
                i++;
            }
            else
            {
                list.add(i);
                end = Math.max(i,end);
                k--;
                i++;
            }
        }
        if (k!=0)
        {
            end = end+k;
        }
        return end;
    }
}
