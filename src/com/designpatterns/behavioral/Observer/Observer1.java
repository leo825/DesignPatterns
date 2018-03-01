package com.designpatterns.behavioral.Observer;
/**
 * ClassName: Observer1.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 上午10:02:55
 * @modifier
 * @modify-date 2018年3月1日 上午10:02:55
 * @version 1.0
 */
public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");

	}

}
