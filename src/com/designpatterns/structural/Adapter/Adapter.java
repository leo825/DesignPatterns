package com.designpatterns.structural.Adapter;
/**
 * ClassName: Adapter.java
 * @Description: 类的适配器模式
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里
 * @author leo
 * @date 2018年2月28日 上午12:11:45
 * @modifier
 * @modify-date 2018年2月28日 上午12:11:45
 * @version 1.0
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
