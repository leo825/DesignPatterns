package com.designpatterns.structural.Facade;

import java.util.spi.CurrencyNameProvider;

/**
 * ClassName: Computer.java
 * @Description: 计算机
 * @author leo
 * @date 2018年2月28日 下午12:20:16
 * @modifier
 * @modify-date 2018年2月28日 下午12:20:16
 * @version 1.0
 */
public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
