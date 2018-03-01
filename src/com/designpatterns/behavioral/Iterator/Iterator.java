package com.designpatterns.behavioral.Iterator;
/**
 * ClassName: Iterator.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 上午10:54:07
 * @modifier
 * @modify-date 2018年3月1日 上午10:54:07
 * @version 1.0
 */
public interface Iterator {

	//前移
	public Object previous();
	
	//后移
	public Object next();
	
	public boolean hasNext();
	
	//取得第一个元素
	public Object first();
	
}
