package com.designpatterns.behavioral.Memento;
/**
 * ClassName: Storage.java
 * @Description: 存储备忘录的类，持有Memento类的实例
 * @author leo
 * @date 2018年3月1日 下午2:37:11
 * @modifier
 * @modify-date 2018年3月1日 下午2:37:11
 * @version 1.0
 */
public class Storage {
	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
