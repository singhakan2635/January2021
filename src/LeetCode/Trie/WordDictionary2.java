package LeetCode.Trie;

public class WordDictionary2
{
    class TrieNode
    {
        public TrieNode[] childrens;
        public boolean isEnd;

        public TrieNode()
        {
            childrens = new TrieNode[26];
            isEnd = false;
        }
    }
    private TrieNode root;
    public WordDictionary2()
    {
        this.root = new TrieNode();
    }

    public void addWord(String word)
    {
        TrieNode node = root;
        for (int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if (node.childrens[ch-'a']==null)
            {
                node.childrens[ch-'a'] = new TrieNode();
            }
            node = node.childrens[ch-'a'];
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
        {
            return curr.isEnd;
        }
        char ch = word.charAt(index);
        if (ch=='.')
        {
            for (int i=0;i<curr.childrens.length;i++)
            {
                if (curr.childrens[i]!=null && search(word,index+1,curr.childrens[i]))
                    return true;
            }
        }
        else
        {
            return curr.childrens[ch-'a']!=null && search(word, index+1, curr.childrens[ch-'a']);
        }
        return false;
    }
}
