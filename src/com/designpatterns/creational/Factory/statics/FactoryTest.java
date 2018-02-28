package com.designpatterns.creational.Factory.statics;

/**
 * @ClassName: FactoryTest
 * @Description: 工厂测试类
 * @author leo
 * @date 2016年5月2日 下午8:43:36
 * @modifier
 * @modify-date 2016年5月2日 下午8:43:36
 * @version 1.0
 */
public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceSms();
		sender.Send();
	}
}
