package com.designpatterns.creational.Factory.statics;

import com.designpatterns.creational.Factory.statics.impl.MailSender;
import com.designpatterns.creational.Factory.statics.impl.SmsSender;

/**
 * @ClassName: SendFactory.java
 * @Description:将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
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
	public static Sender produceMail() {
		return new MailSender();
	}

	/**
	 * 实例化Sms实体
	 * @return
	 */
	public static Sender produceSms() {
		return new SmsSender();
	}
}
