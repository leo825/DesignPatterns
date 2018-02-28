package com.designpatterns.behavioral.Strategy;
/**
 * ClassName: Minus.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 下午10:42:04
 * @modifier
 * @modify-date 2018年2月28日 下午10:42:04
 * @version 1.0
 */
public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "-");
		return arrayInt[0] - arrayInt[1];
	}

}