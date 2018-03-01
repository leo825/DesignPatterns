package com.designpatterns.behavioral.Visitor;
/**
 * ClassName: MyVisitor.java
 * @Description: 访问者实例
 * @author leo
 * @date 2018年3月1日 下午3:43:01
 * @modifier
 * @modify-date 2018年3月1日 下午3:43:01
 * @version 1.0
 */
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject："+sub.getSubject());

	}

}
