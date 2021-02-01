package LeetCode.DailyChallenge;

import java.util.*;

public class TopKFrequentWord
{
    public List<String> topKFrequent(String[] words, int k)
    {
        //List<String> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        for (String s : words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> result = new ArrayList<>(map.keySet());
        Collections.sort(result, (w1,w2) -> map.get(w1).equals(map.get(w2))? w1.compareTo(w2):map.get(w2)-map.get(w1));

        return result.subList(0,k);

    }
}
