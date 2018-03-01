package com.designpatterns.behavioral.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ClassName: AbstractSubject.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 上午10:12:48
 * @modifier
 * @modify-date 2018年3月1日 上午10:12:48
 * @version 1.0
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		vector.add(observer);

	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);

	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			enumeration.nextElement().update();
		}

	}

}
