package com.designpatterns.creational.Builder;

/**
 * @ClassName: Test
 * @Description: 测试 
 * @author leo
 * @date 2016年5月11日 下午4:12:36
 * @modifier
 * @modify-date 2016年5月11日 下午4:12:36
 * @version 1.0
 */
public class Test {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}