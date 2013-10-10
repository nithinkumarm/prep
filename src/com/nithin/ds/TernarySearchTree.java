package com.nithin.ds;

import com.nithin.utils.Utility;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class TernarySearchTree<T extends Comparable<T>> {

    private TernaryNode root;

    public TernarySearchTree(T[] inputArray) {
        root = insert(root, inputArray, 0);
    }

    public TernarySearchTree(TernaryNode<T> rootNode) {
        root = rootNode;
    }

    private TernaryNode insert(TernaryNode<T> node, T[] inputArray, int pos) {

        if(inputArray == null || pos < 0 || pos>=inputArray.length)
            return null;

        if(node == null) {
            node = new TernaryNode(inputArray[pos]);
            if(pos == inputArray.length-1)
                node.setWord(true);
            pos++;
        }
        if(pos < inputArray.length) {

            T c = inputArray[pos];
            int comparison = node.getData().compareTo(c);

            if(comparison == 0) {
                insert(node, inputArray, pos+1);
            } else if(comparison > 0) {
                node.setLeftChild(insert(node.getLeftChild(), inputArray, pos));
            } else {
                node.setRightChild(insert(node.getRightChild(), inputArray, pos));
            }
        }

        return node;
    }

    public void insert(TernaryNode node, T[] inputArray) {
        root = insert(node, inputArray, 0);

    }

    public void insert(T[] inputArray) {
        root = insert(root, inputArray, 0);
    }

    public void print() {
        print(root);
    }

    private void print(TernaryNode node){
        if(node == null)
            return;

        print(node.getLeftChild());
        System.out.print(node.getData());
        print(node.getCenterChild());
        print(node.getRightChild());
    }

    private void levelPrint(TernaryNode node) {

        LinkedList<TernaryNode> queue = new LinkedList<TernaryNode>();
        queue.add(node);

        while(queue.size()>0) {

            TernaryNode temp = queue.removeFirst();
            System.out.println(temp.getData());

            if(temp.getLeftChild() != null)
                queue.add(temp.getLeftChild());
            if(temp.getCenterChild() != null)
                queue.add(temp.getCenterChild());
            if(temp.getRightChild() != null)
                queue.add(temp.getRightChild());
        }
    }

    public static void main(String[] args) {

        TernaryNode<Character> rootNode = new TernaryNode<Character>('n');
        TernarySearchTree<Character> tst = new TernarySearchTree<Character>(rootNode);
        tst.insert(Utility.getCharArray("first"));
        tst.insert(Utility.getCharArray("program"));
        tst.levelPrint(tst.root);
    }

}