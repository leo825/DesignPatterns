package com.designpatterns.creational.factory.multi.impl;

import com.designpatterns.creational.factory.multi.Sender;

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

	
	/* (non-Javadoc)
	 * @Description: 短信发送
	 * @author leo
	 * @date 2016年5月2日 下午8:39:46
	 * @modifier
	 * @modify-date 2016年5月2日 下午8:39:46
	 * @version 1.0
	*/
	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}

}
