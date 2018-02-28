package com.designpatterns.structural.Adapter.object;
/**
 * ClassName: Targetable.java
 * @Description: 需要经source功能扩展到Targetable
 * @author leo
 * @date 2018年2月28日 上午12:10:23
 * @modifier
 * @modify-date 2018年2月28日 上午12:10:23
 * @version 1.0
 */
public interface Targetable {
    /* 与原类中的方法相同 */  
    public void method1();

    /* 新类的方法 */  
    public void method2();
}
