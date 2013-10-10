package com.nithin.ds;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/9/13
 * Time: 1:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class TrieNode {

    private String word;
    private char c;
    private TrieNode[] children;
    private final int NUM_OF_CHILDREN = 26;


    public TrieNode(char c) {
        this.c = c;
        children = new TrieNode[NUM_OF_CHILDREN];
    }


    static int letterIndex(char c) {

        int ascii = c;

        if(ascii>= 97)
            return ascii-97;
        else
            return ascii - 65;
    }

    public boolean addChild(char c) {

        return addChild(new TrieNode(c));
    }

    public boolean addChild(TrieNode child) {

        int pos = letterIndex(child.c);

        if(children[pos] != null)
            return false;

        children[pos] = child;
        return true;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public char getChar() {
        return c;
    }

    public void setChar(char c) {
        this.c = c;
    }

    public TrieNode[] getChildren() {
        return children;
    }

    public void setChildren(TrieNode[] children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TrieNode{" +
                "word='" + word + '\'' +
                ", c=" + c +
                ", children=" + Arrays.toString(children) +
                '}';
    }
}
