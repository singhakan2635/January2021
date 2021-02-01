package LeetCode.DailyChallenge;

public class CheckIfTwoStringsAreEqual
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        String s1 = combineWord(word1);
        String s2 = combineWord(word2);
        return s1.equals(s2);
    }
    private String combineWord(String[] word)
    {
        String s ="";
        for (String str: word)
        {
            s +=str;
        }
        return s;
    }
}
