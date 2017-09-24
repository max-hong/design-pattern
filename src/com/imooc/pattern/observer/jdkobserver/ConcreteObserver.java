package com.imooc.pattern.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer{
	//观察者名称的变量
	private String observerName;

	@Override
	public void update(Observable o, Object arg) {
		//第一种是推得方式
		System.out.println(observerName+"收到了消息，目标推送过的是"+arg);
		
		//第二种是推得方式
				System.out.println(observerName+"收到了消息，主导到目标对象中去拉，拉的内容是"
		+((ConcreteWeatherSubject)o).getContent());
	}

	/**
	 * @return the observerName
	 */
	public String getObserverName() {
		return observerName;
	}

	/**
	 * @param observerName the observerName to set
	 */
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
