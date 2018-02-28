package com.designpatterns.creational.Factory.multi.impl;

import com.designpatterns.creational.Factory.multi.Sender;

/**
 * @ClassName: MailSender.java
 * @Description: 邮件发送实现
 * @author leo
 * @date 2016年5月2日 下午8:30:58
 * @modifier
 * @modify-date 2016年5月2日 下午8:30:58
 * @version 1.0
 */
public class MailSender implements Sender {

	/**
	 * 使用邮件进行发送
	 */
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}

}
