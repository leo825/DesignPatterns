package com.designpatterns.behavioral.Command;


/**
 * ClassName: MyCommand.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午2:06:51
 * @modifier
 * @modify-date 2018年3月1日 下午2:06:51
 * @version 1.0
 */
public class MyCommand implements Command {

	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void exe() {
		receiver.action();
	}

}
