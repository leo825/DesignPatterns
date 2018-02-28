package com.designpatterns.structural.Adapter.class_;
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
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
