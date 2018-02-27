package com.designpatterns.creational.Singleton;

/**
 * @ClassName: SingletonTest
 * @Description:单例测试
 * @author leo
 * @date 2016年5月5日 下午6:58:40
 * @modifier
 * @modify-date 2016年5月5日 下午6:58:40
 * @version 1.0
 */
public class SingletonTest {
	public static void main(String[] args) {
		// 创建两个对象，他们的地址是一样的，说明是创建的同一个对象。
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
	}
}
