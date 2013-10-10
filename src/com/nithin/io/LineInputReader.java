package com.nithin.io;

import com.nithin.core.StorableItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class LineInputReader implements InputReader {

    private Scanner io;
    private static HashMap<String, String> functionMap;
    private List<StorableItem> objectList;

    public LineInputReader() {
        io = new Scanner(System.in);
        objectList = new ArrayList<StorableItem>(10);
    }

    @Override
    public void readInput() {

        String line = io.nextLine();
        System.out.println("Type \"exit\" to stop entering input");

        while(io.hasNext()) {
            line = io.nextLine().toLowerCase();
            if(line.equals("exit"))
                break;
            StorableItem item = parseInput(line);
            System.out.println(item);
        }

        io.close();
    }

    @Override
    public StorableItem parseInput(String line) {

        String[] fields = line.split(",");

        int i=0;
        for(String field : fields) {
            fields[i++] = field.trim();
        }


        StorableItem o = null;

        try {
                o = new StorableItem(getVal(fields[0]), getVal(fields[1]), getVal(fields[2]), Integer.parseInt(fields[3]), getVal(fields[4]), getVal(fields[5]), Double.parseDouble(fields[6]));
                objectList.add(o);
        } catch (NullPointerException|NumberFormatException e) {
            System.out.println("Exception");

        }
        return o;
    }

    @Override
    public List<StorableItem> getObjects() {
        return objectList;
    }

    private String getVal(String val) {

        if(val == null)
            return val;

        return val.substring(1, val.length()-1).trim();
    }

    public static void main(String[] args) {
        LineInputReader ir = new LineInputReader();
        ir.readInput();
    }
}
