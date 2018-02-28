package com.designpatterns.structural.Proxy;
/**
 * ClassName: ProxyTest.java
 * @Description: 代理模式
 * 使用代理对象替换原来的对象
 * @author leo
 * @date 2018年2月28日 上午11:18:13
 * @modifier
 * @modify-date 2018年2月28日 上午11:18:13
 * @version 1.0
 */
public class ProxyTest {

	public static void main(String[] agrs){
		Sourceable proxy = new Proxy();
		proxy.method();
	}
	
}
