package com.designpatterns.creational.Builder;

import java.util.ArrayList;
import java.util.List;

import com.designpatterns.creational.AbstractFactory.Sender;
import com.designpatterns.creational.AbstractFactory.impl.MailSender;
import com.designpatterns.creational.AbstractFactory.impl.SmsSender;

/**
 * ClassName: Builder.java
 * @Description: 创建者模式
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，
 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 * 
 * 从这点看出，建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。所以与工程模式的区别就是：
 * 工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。因此，是选择工厂模式还是建造者模式，依实际情况而定。
 * @author leo
 * @date 2018年2月27日 下午11:26:06
 * @modifier
 * @modify-date 2018年2月27日 下午11:26:06
 * @version 1.0
 */
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
