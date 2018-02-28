package com.designpatterns.structural.Bridge;
/**
 * ClassName: Bridge.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 下午1:10:57
 * @modifier
 * @modify-date 2018年2月28日 下午1:10:57
 * @version 1.0
 */
public abstract class Bridge {
	private Sourceable source;
	
	public void method(){
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

}
