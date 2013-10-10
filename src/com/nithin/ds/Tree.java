package com.nithin.ds;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Tree<T> {

    public int insert(T t);

    public int delete(T t);

    public void print();

    public int getHeight();

}
