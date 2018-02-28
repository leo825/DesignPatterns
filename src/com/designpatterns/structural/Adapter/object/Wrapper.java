package com.designpatterns.structural.Adapter.object;
/**
 * ClassName: Wrapper.java
 * @Description: 对象的是配置模式
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 * @author leo
 * @date 2018年2月28日 上午9:57:55
 * @modifier
 * @modify-date 2018年2月28日 上午9:57:55
 * @version 1.0
 */
public class Wrapper implements Targetable {

	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		 System.out.println("this is the targetable method!");
	}

}
