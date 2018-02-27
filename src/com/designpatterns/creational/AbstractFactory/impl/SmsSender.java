package com.designpatterns.creational.AbstractFactory.impl;

import com.designpatterns.creational.AbstractFactory.Sender;

/**
 * ClassName: SmsSender.java
 * @Description: 短信发送类
 * @author leo
 * @date 2018年2月27日 下午9:55:44
 * @modifier
 * @modify-date 2018年2月27日 下午9:55:44
 * @version 1.0
 */
public class SmsSender implements Sender {

	/**
	 * 发送短信
	 */
	@Override
	public void send() {
		System.out.println("this is sms sender!");
	}

}
