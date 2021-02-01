package LeetCode.DailyChallenge;

import java.util.Arrays;

public class BoatstSavePeople
{
    public int numRescueBoats(int[] people, int limit)
    {
        int res=0;
        int a=0,b= people.length-1;
        Arrays.sort(people);
        while (a<b)
        {
            res+=1;
            if (people[a]+people[b]<=limit)
                a++;
            b--;
        }
        return res;

    }
}
