package com.designpatterns.behavioral.Mediator;
/**
 * ClassName: User.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午4:10:30
 * @modifier
 * @modify-date 2018年3月1日 下午4:10:30
 * @version 1.0
 */
public abstract class User {

	private Mediator mediator;
	
	public User(Mediator mediator){
		this.mediator = mediator;
	}
	
	public Mediator getMediator(){
		return mediator;
	}
	
	public abstract void work();
}
