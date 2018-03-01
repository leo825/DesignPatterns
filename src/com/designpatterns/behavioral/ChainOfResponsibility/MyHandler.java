package com.designpatterns.behavioral.ChainOfResponsibility;
/**
 * ClassName: MyHandler.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午1:53:36
 * @modifier
 * @modify-date 2018年3月1日 下午1:53:36
 * @version 1.0
 */
public class MyHandler extends AbstractHandler implements Handler {

	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}
	
	@Override
	public void operator() {
		System.out.println(name + " deal");
		if(getHandler() != null){
			getHandler().operator();
		}
	}

}
