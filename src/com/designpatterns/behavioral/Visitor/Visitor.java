package com.designpatterns.behavioral.Visitor;
/**
 * ClassName: Visitor.java
 * @Description: 存放要访问的对象
 * @author leo
 * @date 2018年3月1日 下午3:41:40
 * @modifier
 * @modify-date 2018年3月1日 下午3:41:40
 * @version 1.0
 */
public interface Visitor {

	public void visit(Subject sub);
}
