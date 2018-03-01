package com.designpatterns.behavioral.Observer;
/**
 * ClassName: Subject.java
 * @Description: Subject接口以及实现类
 * @author leo
 * @date 2018年3月1日 上午10:04:34
 * @modifier
 * @modify-date 2018年3月1日 上午10:04:34
 * @version 1.0
 */
public interface Subject {

	/** 增加观察者 **/
	public void add(Observer observer);
	
	/** 删除观察者 **/
	public void del(Observer observer);
	
	/** 通知所有的观察者 **/
	public void notifyObservers();
	
	/** 自身操作 **/
	public void operation();
	
}
