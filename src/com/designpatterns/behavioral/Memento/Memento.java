package com.designpatterns.behavioral.Memento;
/**
 * ClassName: Memento.java
 * @Description: 备忘录类
 * @author leo
 * @date 2018年3月1日 下午2:32:06
 * @modifier
 * @modify-date 2018年3月1日 下午2:32:06
 * @version 1.0
 */
public class Memento {
	
	private String value;
	
	public Memento(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
