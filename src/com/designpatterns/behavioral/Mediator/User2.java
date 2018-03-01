package com.designpatterns.behavioral.Mediator;
/**
 * ClassName: User2.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午4:14:57
 * @modifier
 * @modify-date 2018年3月1日 下午4:14:57
 * @version 1.0
 */
public class User2 extends User {


	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");

	}

}
