package LeetCode.DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class BeutifulArrangement
{
    public int countArrangement(int n)
    {
        List<List<Integer>> res=new ArrayList<>();
        int[] num = new int[n+1];
        for (int i=1;i<=n;i++)
        {
            num[i] = i;
        }
        //dfs(res,new ArrayList<>(),num,n);
        System.out.println("Res is "+res);
        return res.size();
    }
    private void dfs(List<List<Integer>> res,List<Integer> templist1,int[] nums,int n,List<Integer> templist2)
    {
        System.out.println("Templist "+templist1);
        if (templist1.size()==n)
        {
            res.add(new ArrayList<>(templist1));
        }
        else
        {
            for (int i=1;i<nums.length;i++)
            {
                if (templist1.contains(nums[i])) continue;
                if (nums[i]%i==0)
                {
                    templist1.add(nums[i]);
                    dfs(res,templist1,nums,n,templist2);
                    templist1.remove(templist1.size()-1);
                }
                if (i%nums[i]==0)
                {
                    templist2.add(i);
                }

            }
        }

    }

}
