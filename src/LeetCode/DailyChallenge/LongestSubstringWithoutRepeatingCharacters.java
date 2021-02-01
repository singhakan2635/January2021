package LeetCode.DailyChallenge;


import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters
{
    public int lengthOfLongestSubstring(String s)
    {
        int maxLength=0;
        int a =0,b=0;
        Set<Character> set = new HashSet<>();
        while (b<s.length())
        {
            if (!set.contains(s.charAt(b)))
            {
                set.add(s.charAt(b));
            }
            else
            {
                set.remove(s.charAt(a));
                a++;

            }
            maxLength = Math.max(maxLength,b-a+1);
            b++;
        }
        return maxLength;

    }
}
