package LeetCode.Trie;

public class DesignAddWordDataStructure
{
    class TrieNode1
    {
        public TrieNode1[] childerens = new TrieNode1[26];
        public boolean isEnd;

    }
    private TrieNode1 root;
    class WordDictionary {

        /** Initialize your data structure here. */
        public WordDictionary()
        {
            root = new TrieNode1();

        }

        /** Adds a word into the data structure. */
        public void addWord(String word)
        {
            TrieNode1 node = root;
            for (char c:word.toCharArray())
            {
                if (node.childerens[c-'a']==null)
                {
                    node.childerens[c-'a'] = new TrieNode1();
                }
                node = node.childerens[c-'a'];
            }
            node.isEnd = true;

        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word)
        {
            return true;
        }


    }
}
