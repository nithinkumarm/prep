package com.nithin.io;

import com.nithin.core.StorableItem;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public interface InputReader {

    public void readInput();

    public Object parseInput(String input);

    public List<StorableItem> getObjects();

}
