package com.nithin.ds;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/9/13
 * Time: 1:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class TrieTree {

    private TrieNode root;

    public TrieTree() {
        root = new TrieNode('\0');
    }

    public void insert(String word) {

        if(word == null || word.length()==0)
            return;

        char[] array = word.toCharArray();
        TrieNode node = root;

        for(char c : array) {

            if(node.getChar() == c)
                continue;

            int pos = (int)(c) - 97;
            TrieNode child = node.getChildren()[pos];

            if(child == null) {
                child = new TrieNode(c);
                node.getChildren()[pos] = child;
                System.out.println( node + " " + c + " " + pos);
            }

            node = child;
        }
    }

    public TrieNode search(String word) {

        if(word == null || word.length()==0)
            return null;

        TrieNode node = root;
        for(char c : word.toCharArray()) {

            if(node == null)
                return null;

            int pos = (int) c - 97;
            System.out.println(pos + " " + c);
            TrieNode[] children = node.getChildren();

            node = children[pos];
        }

        return node;
    }

    public static void main(String[] args) {

        TrieTree tree = new TrieTree();
        tree.insert("nithin");
        System.out.println(tree.root);
        System.out.println(tree.search("nithin"));
    }
}
