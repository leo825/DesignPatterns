package com.designpatterns.behavioral.Strategy;
/**
 * ClassName: Multiply.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 下午10:42:33
 * @modifier
 * @modify-date 2018年2月28日 下午10:42:33
 * @version 1.0
 */
public class Multiply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}
}