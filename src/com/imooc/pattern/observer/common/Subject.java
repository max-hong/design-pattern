package com.imooc.pattern.observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 * 
 * @author honghao
 *
 */
public class Subject {

	// 用来保存注册的观察者模式
	private List<Observer> observers = new ArrayList<>();

	// attach detach notifyObservers

	/**
	 * 注册观察者
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	/**
	 * 删除观察者
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}

	/**
	 * 通知所有注册的观察者对象
	 */
	protected void notifyObservers() {
		for(Observer observer:observers){
			observer.update(this);
		}
	}
	
	
}
