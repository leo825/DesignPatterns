package com.designpatterns.creational.AbstractFactory.impl;

import com.designpatterns.creational.AbstractFactory.Sender;

/**
* ClassName: MailSender.java
* @Description: 邮件发送类
* @author leo
* @date 2018年2月27日 下午9:51:10
* @modifier
* @modify-date 2018年2月27日 下午9:51:10
* @version 1.0
*/
public class MailSender implements Sender {

	/**
	 * 邮件发送
	 */
	@Override
	public void send() {
		System.out.println("this is mailsender!");
	}

}
