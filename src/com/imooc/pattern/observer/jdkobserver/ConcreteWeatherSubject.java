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
	}
	
	
}
