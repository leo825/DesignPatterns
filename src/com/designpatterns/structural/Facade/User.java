package com.designpatterns.structural.Facade;
/**
 * ClassName: User.java
 * @Description: 外观模式
 * 外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，
 * 而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口
 * @author leo
 * @date 2018年2月28日 下午12:25:17
 * @modifier
 * @modify-date 2018年2月28日 下午12:25:17
 * @version 1.0
 */
public class User {
	public static void main(String[] agrs){
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

}
