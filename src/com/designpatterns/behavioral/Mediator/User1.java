package com.designpatterns.behavioral.Mediator;
/**
 * ClassName: User1.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午4:12:18
 * @modifier
 * @modify-date 2018年3月1日 下午4:12:18
 * @version 1.0
 */
public class User1 extends User {

	public User1(Mediator mediator) {
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user1 exe!");

	}

}
