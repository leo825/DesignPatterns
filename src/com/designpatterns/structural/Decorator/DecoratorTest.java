package com.designpatterns.structural.Decorator;
/**
 * ClassName: DecoratorTest.java
 * @Description: 装饰器模式
 * 顾名思义，装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * @author leo
 * @date 2018年2月28日 上午11:05:03
 * @modifier
 * @modify-date 2018年2月28日 上午11:05:03
 * @version 1.0
 */
public class DecoratorTest {

	public static void main(String[] agrs){
		Source source = new Source();
		Decorator decorator = new Decorator(source);
		decorator.method();
	}
}
