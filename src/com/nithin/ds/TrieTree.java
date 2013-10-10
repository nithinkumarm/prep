package com.nithin.ds;

import java.util.List;

import static com.nithin.ds.TrieNode.letterIndex;

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

    public TrieTree(List<String> words) {
        this();
        for(String word : words) {
            insert(word);
        }
    }

    public void insert(String word) {

        if(word == null || word.length()==0)
            return;

        char[] array = word.toCharArray();
        TrieNode node = root;

        for(int i=0; i < array.length; i++) {
            char c = array[i];

            if(node.getChar() == c)
                continue;

            int pos = letterIndex(c);
            TrieNode child = node.getChildren()[pos];

            if(child == null) {
                node.addChild(c);
            }

            node = node.getChildren()[pos];

            if(i == array.length-1)
                node.setWord(word);
        }
    }

    public TrieNode search(String word) {

        if(word == null || word.length()==0)
            return null;

        TrieNode node = root, start_node;

        start_node = node.getChildren()[ letterIndex(word.charAt(0)) ];
        for(char c : word.toCharArray()) {

            if(node == null)
                return null;

            int pos = letterIndex(c);
            TrieNode[] children = node.getChildren();

            node = children[pos];
        }

        if(node.getWord()!= null)
            return start_node;
        else
            return null;
    }

    public void delete(String word) {

        if (word==null || word.trim().length()==0)
            return;


        TrieNode node = root;
        for(char c : word.toCharArray()) {
            node = node.getChildren()[letterIndex(c)];
        }
        node.setWord(null);

    }

    public static void main(String[] args) {

        TrieTree tree = new TrieTree();
        tree.insert("nithin");
        System.out.println(tree.search("nithin"));
    }
}
