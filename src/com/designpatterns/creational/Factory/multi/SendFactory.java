package com.designpatterns.creational.Factory.multi;

import com.designpatterns.creational.Factory.multi.impl.MailSender;
import com.designpatterns.creational.Factory.multi.impl.SmsSender;

/**
 * @ClassName: SendFactory.java
 * @Description:多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，
 * 则不能正确创建对象， 而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 * @author leo
 * @date 2016年5月2日 下午8:42:05
 * @modifier
 * @modify-date 2016年5月2日 下午8:42:05
 * @version 1.0
 */
public class SendFactory {
	/**
	 * 实例化mailSender实体
	 * @return
	 */
	public Sender produceMail() {
		return new MailSender();
	}

	/**
	 * 实例化Sms实体
	 * @return
	 */
	public Sender produceSms() {
		return new SmsSender();
	}
}
