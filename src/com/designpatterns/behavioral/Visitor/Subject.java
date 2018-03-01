package com.designpatterns.behavioral.Visitor;
/**
 * ClassName: Subject.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午3:40:38
 * @modifier
 * @modify-date 2018年3月1日 下午3:40:38
 * @version 1.0
 */
public interface Subject {

	/**
	 * 接受要访问它的对象
	 * @param visitor
	 */
	public void accept(Visitor visitor);
	
	/**
	 * 获取将要被访问的属性
	 * @return
	 */
	public String getSubject();
}
