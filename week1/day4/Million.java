import java.io.*;

class Trie
{
    final int ALPHABET_SIZE=26;
    TrieNode root=new TrieNode();
    class TrieNode
    {
        TrieNode[] child=new TrieNode[ALPHABET_SIZE];
        boolean temp;
        TrieNode()
        {
            temp=false;
            for(int i=0;i<ALPHABET_SIZE;i++)
            {
                child[i]=null;
            }
        }

    }
    public boolean insert(String key)
    {
        int keylevel;
        int length=key.length();
        int index;
        TrieNode node=root;
        for(keylevel=0;keylevel<length;keylevel++)
        {
            index=key.charAt(keylevel)-'a';
            if(node.child[index]==null)
                node.child[index]=new TrieNode();

            node=node.child[index];
        }
        if(node.temp==true)
        {
            return false;
        }
        else
        {
            node.temp = true;
            return true;
        }
    }
    public boolean search(String key)
    {
        int keylevel;
        int length=key.length();
        int index;
        TrieNode node=root;
        for(keylevel=0;keylevel<length;keylevel++)
        {
            index=key.charAt(keylevel)-'a';
            if(node.child[index]==null)
                return false;

            node=node.child[index];
        }
        return node!=null && node.temp;
    }
}
public class MillionGazillion {


    public static void main(String[] args) {
        Trie t=new Trie();
        System.out.println(t.insert("bag"));
        System.out.println(t.insert("cloud"));
        System.out.println(t.insert("chair"));
        System.out.println(t.insert("bag"));
        System.out.println(t.insert("phone"));
        System.out.println(t.insert("pen"));
        System.out.println(t.insert("chair"));
    }
}
