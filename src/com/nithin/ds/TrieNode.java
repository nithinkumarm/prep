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
