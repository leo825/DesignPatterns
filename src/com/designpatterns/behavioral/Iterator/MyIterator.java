package com.designpatterns.behavioral.Iterator;
/**
 * ClassName: MyIterator.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 上午10:59:44
 * @modifier
 * @modify-date 2018年3月1日 上午10:59:44
 * @version 1.0
 */
public class MyIterator implements Iterator {

	private Collection collection;
	private int pos = -1;
	
	public MyIterator(Collection collection) {
		this.collection = collection;
	}
	
	
	@Override
	public Object previous() {
		if(pos > 0){
			pos --;
		}
		
		return collection.get(pos);
	}

	@Override
	public Object next() {
		if(pos < collection.size()-1){
			pos++;
		}
			
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		if(pos < collection.size() -1)
			return true;
		return false;
	}

	@Override
	public Object first() {
		pos = 0;
		return collection.get(pos);
	}

}
