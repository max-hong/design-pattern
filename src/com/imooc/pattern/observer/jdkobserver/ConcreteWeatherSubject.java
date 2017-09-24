package com.imooc.pattern.observer.jdkobserver;

import java.util.Observable;
/**
 * 天气目标的具体实现类
 * @author honghao
 *
 */
public class ConcreteWeatherSubject extends Observable{
	
	/**
	 * 天气情况的内容
	 */
	private String content;

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
		//天气情况有了，就要通知所有观察者
		//注意在通知之前，在用java中的Observer模式的时候，下面这句话不可少
		this.setChanged();
		//然后主动通知，这里我们先用推得方式
		this.notifyObservers(content);
		//如果是拉的方式，我们就调用
		//this.notifyObservers();
	}
	
	
}
