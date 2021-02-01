package LeetCode.Trie;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary
{
    class TrieNode
    {
        public HashMap<Character,TrieNode> children;
        public boolean isEnd;

        public TrieNode() {
            this.children = new HashMap<>();
            this.isEnd = false;
        }
    }

    public TrieNode root;

    public WordDictionary()
    {
        root = new TrieNode();
    }
    public void addWord(String word)
    {
        TrieNode node = root;

        for (int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if (node.children.get(ch)==null)
            {
                node.children.put(ch,new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.isEnd = true;
    }

    public boolean search(String word)
    {
        return search(word,0,root);
    }
    private boolean search(String word, int index, TrieNode curr)
    {
        if (index==word.length())
            return curr.isEnd;

        char ch = word.charAt(index);

        if (ch=='.')
        {
            for (Map.Entry<Character,TrieNode> child: curr.children.entrySet())
            {
                if (search(word, index+1, child.getValue()))
                    return true;
            }
        }
        else
        {
            TrieNode node = curr.children.get(ch);
            if (node!=null)
            {
                return search(word, index+1, node);
            }
        }
        return false;
    }
}
