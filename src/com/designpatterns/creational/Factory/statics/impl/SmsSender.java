package com.designpatterns.creational.Factory.statics.impl;

import com.designpatterns.creational.Factory.statics.Sender;

/**
 * 
 * @ClassName: SmsSender
 * @Description: 短信发送实现类
 * @author leo
 * @date 2016年5月2日 下午8:39:22
 * @modifier
 * @modify-date 2016年5月2日 下午8:39:22
 * @version 1.0
 */
public class SmsSender implements Sender {

	
	/**
	 * 短信发送
	 */
	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}

}
