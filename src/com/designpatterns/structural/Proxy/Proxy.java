package com.designpatterns.structural.Proxy;
/**
 * ClassName: Proxy.java
 * @Description: 描述
 * @author leo
 * @date 2018年2月28日 上午11:15:59
 * @modifier
 * @modify-date 2018年2月28日 上午11:15:59
 * @version 1.0
 */
public class Proxy implements Sourceable {

	private Source source;
	public Proxy() {
		super();
		source = new Source();
	}
	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}

    private void atfer() {
        System.out.println("after proxy!");
    }  
    private void before() {
        System.out.println("before proxy!");
    }
}
