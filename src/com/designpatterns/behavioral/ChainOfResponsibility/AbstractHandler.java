package com.designpatterns.behavioral.ChainOfResponsibility;
/**
 * ClassName: AbstractHandler.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午1:40:41
 * @modifier
 * @modify-date 2018年3月1日 下午1:40:41
 * @version 1.0
 */
public abstract class AbstractHandler {

	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
