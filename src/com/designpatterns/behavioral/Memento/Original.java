package com.designpatterns.behavioral.Memento;
/**
 * ClassName: Original.java
 * @Description: 原始类
 * @author leo
 * @date 2018年3月1日 下午2:30:57
 * @modifier
 * @modify-date 2018年3月1日 下午2:30:57
 * @version 1.0
 */
public class Original {
	
	private String value;
	
	public Original(String value) {  
        this.value = value;  
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento createMemento(){
		return new Memento(value);
	}
	
	public void restoreMemento(Memento memento){
		value = memento.getValue();
	}
	
}
