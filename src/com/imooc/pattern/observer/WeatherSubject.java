package com.imooc.pattern.observer;

import java.util.ArrayList;
import java.util.List;

import com.imooc.pattern.observer.Observer;

public class WeatherSubject {
	// 用来保存注册的观察者模式
	private List<Observer> observers = new ArrayList<>();

	// attach detach notifyObservers

	/**
	 * 把订阅天气的人添加到订阅者列表中
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	/**
	 * 删除集合中的指定订阅天气的人
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}

	/**
	 * 通知所有已经订阅了天气的人
	 */
	protected void notifyObservers() {
		if(observers.isEmpty()) {
			System.out.println("没有人订阅天气预报");
		}else {
			for (Observer observer : observers) {
				observer.update(this);
			}
		}
	}
}
