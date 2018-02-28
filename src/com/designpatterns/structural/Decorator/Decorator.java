package com.designpatterns.structural.Decorator;
/**
 * ClassName: Decorator.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 上午11:02:01
 * @modifier
 * @modify-date 2018年2月28日 上午11:02:01
 * @version 1.0
 */
public class Decorator implements Sourceable{
	
	private Source source;
	
	public Decorator(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");
		
	}

}
