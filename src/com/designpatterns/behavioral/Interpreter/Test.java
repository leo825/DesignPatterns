package com.designpatterns.behavioral.Interpreter;
/**
 * ClassName: Test.java
 * @Description: 解释器模式
 * 一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄，解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等
 * @author leo
 * @date 2018年3月1日 下午4:37:11
 * @modifier
 * @modify-date 2018年3月1日 下午4:37:11
 * @version 1.0
 */
public class Test {
	public static void main(String[] args) {

		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
