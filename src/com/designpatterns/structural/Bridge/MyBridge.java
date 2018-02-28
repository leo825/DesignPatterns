package com.designpatterns.structural.Bridge;
/**
 * ClassName: MyBridge.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 下午1:13:54
 * @modifier
 * @modify-date 2018年2月28日 下午1:13:54
 * @version 1.0
 */
public class MyBridge extends Bridge{
	public void method(){
		getSource().method();
	}
}
