package com.designpatterns.behavioral.Visitor;
/**
 * ClassName: MySubject.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 下午3:45:09
 * @modifier
 * @modify-date 2018年3月1日 下午3:45:09
 * @version 1.0
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	@Override
	public String getSubject() {
		return "love";
	}

}
