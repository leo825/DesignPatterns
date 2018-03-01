package com.designpatterns.behavioral.Interpreter;
/**
 * ClassName: Plus.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午4:31:46
 * @modifier
 * @modify-date 2018年3月1日 下午4:31:46
 * @version 1.0
 */
public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}

}
