package com.designpatterns.structural.Adapter.object;
/**
 * ClassName: AdapterTest.java
 * @Description: 测试类的适配器模式
 * @author leo
 * @date 2018年2月28日 上午12:14:08
 * @modifier
 * @modify-date 2018年2月28日 上午12:14:08
 * @version 1.0
 */
public class AdapterTest {
	public static void main(String[] args) {
		Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
