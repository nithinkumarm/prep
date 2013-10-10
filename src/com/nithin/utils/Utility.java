package com.nithin.utils;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public final class Utility {

    public static Character[] getCharArray(String str) {

        Character[] array = new Character[str.length()];

        int i=0;
        for(char c : str.toCharArray()) {
            array[i++] = c;
        }

        return  array;
    }
}
