package com.designpatterns.structural.Facade;
/**
 * ClassName: Disk.java
 * @Description: 硬盘
 * @author leo
 * @date 2018年2月28日 下午12:19:10
 * @modifier
 * @modify-date 2018年2月28日 下午12:19:10
 * @version 1.0
 */
public class Disk {
    public void startup(){
        System.out.println("disk startup!");
    }

    public void shutdown(){
        System.out.println("disk shutdown!");
    }
}
