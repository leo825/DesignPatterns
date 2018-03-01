package com.designpatterns.behavioral.Observer;
/**
 * ClassName: MySubject.java
 * @Description: 描述
 * @author leo
 * @date 2018年3月1日 上午10:17:23
 * @modifier
 * @modify-date 2018年3月1日 上午10:17:23
 * @version 1.0
 */
public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
        System.out.println("update self!");  
        notifyObservers();

	}

}
