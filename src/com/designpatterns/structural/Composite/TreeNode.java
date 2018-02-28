package com.designpatterns.structural.Composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ClassName: TreeNode.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 下午2:15:45
 * @modifier
 * @modify-date 2018年2月28日 下午2:15:45
 * @version 1.0
 */
public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	
	public TreeNode(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	//添加孩子节点
	public void add(TreeNode node){
		children.add(node);
	}
	
	//删除孩子节点
	public void remove(TreeNode node){
		children.remove(node);
	}
	
	public Enumeration<TreeNode> getChildren(){
		return children.elements();
	}
}
