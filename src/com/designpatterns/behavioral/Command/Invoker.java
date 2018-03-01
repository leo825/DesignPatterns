package com.designpatterns.behavioral.Command;
/**
 * ClassName: Invoker.java
 * @Description: 调用者(司令)
 * @author leo
 * @date 2018年3月1日 下午2:12:50
 * @modifier
 * @modify-date 2018年3月1日 下午2:12:50
 * @version 1.0
 */
public class Invoker {

	private Command command;
	
	public Invoker(Command command){
		this.command = command;
	}
	
	public void action(){
		command.exe();
	}
}
