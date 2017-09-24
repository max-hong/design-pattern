package com.imooc.pattern.observer.jdkobserver;

public class Test {
	public static void main(String[] args) {
		//创建目标对象
		ConcreteWeatherSubject concreteWeatherSubject = new ConcreteWeatherSubject();
		
		//创建观察者对象
		ConcreteObserver girl = new ConcreteObserver();
		girl.setObserverName("黄明的女朋友");
		ConcreteObserver mom = new ConcreteObserver();
		mom.setObserverName("黄明的老妈");
		
		//注册观察者
		concreteWeatherSubject.addObserver(girl);
		concreteWeatherSubject.addObserver(mom);
		
		//目标更新天气情况
		concreteWeatherSubject.setContent("天气晴，气温28度");
		concreteWeatherSubject.getContent();
	}

}
