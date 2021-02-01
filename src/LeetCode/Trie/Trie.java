package LeetCode.Trie;

public class Trie
{
    private TrieNode root;
    public Trie() {
        this.root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word)
    {
        TrieNode node = root;
        for (int i=0;i<word.length();i++)
        {
            char currChar = word.charAt(i);
            if (!node.containsKey(currChar))
            {
                node.put(currChar,new TrieNode());
            }
            node = node.get(currChar);
        }
        node.setEnd();

    }
    private TrieNode serachkey(String word)
    {
        TrieNode node = root;
        for (int i=0;i<word.length();i++)
        {
            char currChar = word.charAt(i);
            if (node.containsKey(currChar))
            {
                node = node.get(currChar);
            }
            else
                return null;
        }
        return node;
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word)
    {
        TrieNode node = serachkey(word);
        return node!=null && node.isEnd();

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix)
    {
        TrieNode node = serachkey(prefix);
        return node!=null;

    }
}
