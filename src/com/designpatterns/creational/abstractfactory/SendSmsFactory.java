package com.designpatterns.creational.AbstractFactory;

import com.designpatterns.creational.AbstractFactory.impl.SmsSender;

/**
 * ClassName: SendSmsFactory.java
 * @Description: 发送短信的工厂
 * @author leo
 * @date 2018年2月27日 下午10:10:14
 * @modifier
 * @modify-date 2018年2月27日 下午10:10:14
 * @version 1.0
 */
public class SendSmsFactory implements Provider {

	/**
	 * 生成发送短信的类
	 */
	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
