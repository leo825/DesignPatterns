package com.designpatterns.behavioral.Strategy;
/**
 * ClassName: AbstractCalculator.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 下午3:29:49
 * @modifier
 * @modify-date 2018年2月28日 下午3:29:49
 * @version 1.0
 */
public abstract class AbstractCalculator {

	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
