package LeetCode.DailyChallenge;

import java.util.*;

public class WordLadder
{
    public int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        set.remove(beginWord);
        queue.offer(beginWord);
        int level = 0;
        while (!queue.isEmpty())
        {
            int size = queue.size();
            level++;
            for (int i=0;i<size;i++)
            {
                String currWord = queue.poll();
                if (currWord.equals(endWord))
                    return level;
                List<String> neighbours = helper(currWord);
                for (String word : neighbours)
                {
                    if (set.contains(word))
                    {
                        set.remove(word);
                        queue.offer(word);
                    }
                }
            }
        }
        return 0;


    }

    private List<String> helper(String s)
    {
        char[] chars = s.toCharArray();
        List<String> result = new ArrayList<>();
        for (int i=0;i<chars.length;i++)
        {
            char temp = chars[i];
            for (char c ='a';c<='z';c++)
            {
                chars[i] = c;
                String neigh = new String(chars);
                result.add(neigh);
            }
            chars[i] = temp;
        }
        return result;
    }
}
