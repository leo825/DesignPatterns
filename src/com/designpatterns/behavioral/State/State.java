package com.designpatterns.behavioral.State;
/**
 * ClassName: State.java
 * @Description: 状态类
 * @author leo
 * @date 2018年3月1日 下午2:54:22
 * @modifier
 * @modify-date 2018年3月1日 下午2:54:22
 * @version 1.0
 */
public class State {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void method1() {
		System.out.println("execute the first opt!");
	}

	public void method2() {
		System.out.println("execute the second opt!");
	}

}
