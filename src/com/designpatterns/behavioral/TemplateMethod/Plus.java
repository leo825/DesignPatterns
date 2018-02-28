package com.designpatterns.behavioral.TemplateMethod;
/**
 * ClassName: Plus.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 下午11:06:40
 * @modifier
 * @modify-date 2018年2月28日 下午11:06:40
 * @version 1.0
 */
public class Plus extends AbstractCalculator{

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

}
