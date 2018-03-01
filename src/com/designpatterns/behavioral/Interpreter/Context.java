package com.designpatterns.behavioral.Interpreter;
/**
 * ClassName: Context.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午4:30:13
 * @modifier
 * @modify-date 2018年3月1日 下午4:30:13
 * @version 1.0
 */
public class Context {

	private int num1;
	private int num2;
	
	public Context(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
