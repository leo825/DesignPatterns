package com.designpatterns.behavioral.Iterator;


/**
 * ClassName: MyCollection.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 上午10:57:11
 * @modifier
 * @modify-date 2018年3月1日 上午10:57:11
 * @version 1.0
 */
public class MyCollection implements Collection {

	public String[] string={"A","B","C","D","E"};
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return string[i];
	}

	@Override
	public int size() {
		return string.length;
	}

}
