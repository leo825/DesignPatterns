package com.designpatterns.behavioral.Iterator;


/**
 * ClassName: Collection.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 上午10:51:14
 * @modifier
 * @modify-date 2018年3月1日 上午10:51:14
 * @version 1.0
 */
public interface Collection {

	public Iterator iterator();
	
	/** 取得集合元素 **/
	public Object get(int i);
	
	/** 取得集合大小 **/
	public int size();
}
