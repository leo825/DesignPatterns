package com.designpatterns.behavioral.Interpreter;
/**
 * ClassName: Minus.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午4:32:45
 * @modifier
 * @modify-date 2018年3月1日 下午4:32:45
 * @version 1.0
 */
public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}

}
