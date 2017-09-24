package com.imooc.pattern.observer.common;

/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @author honghao
 *
 */
public interface Observer {
	
	/**
	 * 更新的接口
	 * @param subject 传入的目标对象
	 */
	public void update(Subject subject);

}
