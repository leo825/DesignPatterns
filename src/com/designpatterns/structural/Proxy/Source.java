package com.designpatterns.structural.Proxy;
/**
 * ClassName: Source.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 上午11:14:59
 * @modifier
 * @modify-date 2018年2月28日 上午11:14:59
 * @version 1.0
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		 System.out.println("the original method!");
	}

}
