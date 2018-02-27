package com.designpatterns.creational.factory.statics;

import com.designpatterns.creational.factory.statics.impl.MailSender;
import com.designpatterns.creational.factory.statics.impl.SmsSender;

/**
 * @ClassName: SendFactory
 * @Description:将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
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
	public static Sender produceMail() {
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
	public static Sender produceSms() {
		return new SmsSender();
	}
}
