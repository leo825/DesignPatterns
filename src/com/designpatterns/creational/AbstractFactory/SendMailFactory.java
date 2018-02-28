package com.designpatterns.creational.AbstractFactory;

import com.designpatterns.creational.AbstractFactory.impl.MailSender;

/**
 * ClassName: SendMailFactory.java
 * @Description: 发送邮件的工厂
 * @author leo
 * @date 2018年2月27日 下午10:09:18
 * @modifier
 * @modify-date 2018年2月27日 下午10:09:18
 * @version 1.0
 */
public class SendMailFactory implements Provider {

	/**
	 * 生成发送邮件的类
	 */
	@Override
	public Sender produce() {
		return new MailSender();
	}

}
