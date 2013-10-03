package com.nithin;

import java.util.Arrays;
import java.util.List;

public class BTreeNode {

	char data;
	List<BTreeNode> children;
	
	public BTreeNode(int size){
		children = Arrays.asList(new BTreeNode[size]);
	}
	
}
