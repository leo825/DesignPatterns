package com.designpatterns.behavioral.State;
/**
 * ClassName: Context.java
 * @Description: 状态模式的切换类
 * @author leo
 * @date 2018年3月1日 下午2:55:38
 * @modifier
 * @modify-date 2018年3月1日 下午2:55:38
 * @version 1.0
 */
public class Context {

	private State state;
	
	public Context(State state){
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state){
		
	}
	
	public void method(){
		if(state.getValue().equals("state1")){
			state.method1();
		}else if(state.getValue().equals("state2")){
			state.method2();
		}
	}
}
