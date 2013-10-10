package com.nithin.ds;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class RadixNode<T extends CharSequence & Comparable<T>> {

    T data;
    RadixNode[] children;

    public RadixNode(T data) {

        this.data = data;
        children = new RadixNode[26];
    }

    public int matchingLength(String input) {
        if(input == null)
            return 0;

        int i = 0;
        for(; i<input.length(); i++) {
            if(input.charAt(i) != data.charAt(i))
                break;
        }

        return i;
    }
}
