package com.nithin.ds; /**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Node designed for Ternary Search com.nithin.ds.Tree
 */
public class TernaryNode<T extends Comparable<T>> {

    private T data;
    private TernaryNode leftChild = null;
    private TernaryNode rightChild = null;
    private boolean isWord = false;

    @Override
    public String toString() {
        StringBuilder sbr = new StringBuilder();
        sbr.append("c:" + data + " ");
        if(leftChild != null)
            sbr.append(" left:" + leftChild.data + " ");
        if(centerChild != null)
            sbr.append(" center:" + centerChild.data + " ");
        if(rightChild != null)
            sbr.append(" right:" + rightChild.data + " ");
        return sbr.toString();
    }

    public TernaryNode(T c) {
        data = c;
        leftChild = null;
        rightChild = null;
    }

    public TernaryNode getCenterChild() {
        return centerChild;
    }

    public void setCenterChild(TernaryNode centerChild) {
        this.centerChild = centerChild;
    }

    public TernaryNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TernaryNode rightChild) {
        this.rightChild = rightChild;
    }

    public TernaryNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TernaryNode leftChild) {
        this.leftChild = leftChild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private TernaryNode centerChild;


    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}
