package com.designpatterns.behavioral.Command;
/**
 * ClassName: Receiver.java
 * @Description: 被调用者（士兵）
 * @author leo
 * @date 2018年3月1日 下午2:11:47
 * @modifier
 * @modify-date 2018年3月1日 下午2:11:47
 * @version 1.0
 */
public class Receiver {

	public void action(){
		System.out.println("command received!");
	}
	
}
