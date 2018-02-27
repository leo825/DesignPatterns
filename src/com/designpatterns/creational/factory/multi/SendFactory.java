package com.designpatterns.creational.factory.multi;

import com.designpatterns.creational.factory.multi.impl.MailSender;
import com.designpatterns.creational.factory.multi.impl.SmsSender;

/**
 * @ClassName: SendFactory
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
	 * Class Name: SendFactory.java
	 * 
	 * @Description: 实例化mailSender实体
	 * @author leo
	 * @date 2016年5月2日 下午8:42:25
	 * @modifier
	 * @modify-date 2016年5月2日 下午8:42:25
	 * @version 1.0
	 * @param type发送类型
	 * @return
	 */
	public Sender produceMail() {
		return new MailSender();
	}

	/**
	 * Class Name: SendFactory.java
	 * 
	 * @Description:实例化Sms实体
	 * @author leo
	 * @date 2016年5月3日 下午1:12:28
	 * @modifier
	 * @modify-date 2016年5月3日 下午1:12:28
	 * @version 1.0
	 * @return
	 */
	public Sender produceSms() {
		return new SmsSender();
	}
}
