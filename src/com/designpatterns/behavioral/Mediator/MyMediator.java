package com.designpatterns.behavioral.Mediator;



/**
 * ClassName: MyMediator.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午4:09:50
 * @modifier
 * @modify-date 2018年3月1日 下午4:09:50
 * @version 1.0
 */
public class MyMediator implements Mediator {

	private User user1;
	private User user2;
	
	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}

}
