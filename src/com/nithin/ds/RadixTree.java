package com.nithin.ds;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class RadixTree {

    RadixNode root;

    public RadixTree() {
        root = new RadixNode<String>("\0");
    }

    public int insert(String newData) {

        RadixNode<String> node = new RadixNode<String>(newData);
        return insert(node);
    }

    public int insert(RadixNode<String> node) {
        return insert(root, node, 0);  //To change body of implemented methods use File | Settings | File Templates.
    }

    private int insert(RadixNode<String> parent, RadixNode<String> node, int height) {

        if(node == null)
            return -1;

        int count = parent.matchingLength(node.data);

        if(count == 0) {
        }

        return 0;
    }

    public int delete(Object o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void print() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public int getHeight() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
