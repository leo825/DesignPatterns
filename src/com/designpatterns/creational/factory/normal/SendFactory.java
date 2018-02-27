package com.designpatterns.creational.factory.normal;

import com.designpatterns.creational.factory.normal.impl.MailSender;
import com.designpatterns.creational.factory.normal.impl.SmsSender;

/**
 * @ClassName: SendFactory.java
 * @Description: 发送工厂类
 * 工厂模式是我们最常用的实例化对象模式，是用工厂方法代替new操作的一种模式。
 * 应用环境：当一个类无法预料要创建哪种类的对象或是一个类需要由子类来指定，创建的对象时，就需要用到工厂模式。
 * 比如这里的发送消息，就不知道要用哪种方式进行发送，所以我们使用工厂模式
 * 解决方案：定义一个创建对象的类，在类的方法中决定具体实例化哪一个类。
 * 本质：就是根据不同的情况来选择不同的实现类，重在选择。
 * 优点：客户端不需要修改太多代码，只需要设置方式即可。例如：Sender sender = factory.produce("mail");
 * 缺点： 当需要增加新的发送方式的时候，需新加发送方式，修改工厂类，违反了开闭原则。
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
	 * @Description: 实例化要发送的方式的实体
	 * @author leo
	 * @date 2016年5月2日 下午8:42:25
	 * @modifier
	 * @modify-date 2016年5月2日 下午8:42:25
	 * @version 1.0
	 * @param type发送类型
	 * @return
	 */
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
