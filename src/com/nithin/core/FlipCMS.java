package com.nithin.core;

import com.nithin.ds.TernaryNode;
import com.nithin.ds.TernarySearchTree;
import com.nithin.io.InputReader;
import com.nithin.io.LineInputReader;
import com.nithin.utils.Utility;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 11:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class FlipCMS {

    TernarySearchTree<Character> storage;
    InputReader reader;

    {
        reader = new LineInputReader();
        storage = new TernarySearchTree<Character>(new TernaryNode<Character>('n'));
    }

    public void buildIndex() {
        reader.readInput();
        List<StorableItem> itemList = reader.getObjects();

        for(StorableItem item : itemList) {

            TernaryNode<StorableItem> itemNode = new TernaryNode<StorableItem>(item);
            storage.insert(itemNode, Utility.getCharArray(itemNode.getData().getName()));
        }

    }

    public static void main(String[] args) {
        FlipCMS cms = new FlipCMS();
        cms.buildIndex();
        cms.storage.print();
    }
}
