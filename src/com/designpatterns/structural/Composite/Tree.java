package com.designpatterns.structural.Composite;
/**
 * ClassName: Tree.java
 * @Description: 组合模式
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * @author leo
 * @date 2018年2月28日 下午2:40:09
 * @modifier
 * @modify-date 2018年2月28日 下午2:40:09
 * @version 1.0
 */
public class Tree {

	TreeNode root = null;
	public Tree(String name){
		root = new TreeNode(name);
	}
	
	public static void main(String[] agrs){
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
	}
}
