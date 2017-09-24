package com.imooc.pattern.observer;

public class Test {
	public static void main(String[] args) {
		//1.创建目标
		ConcreteWeatherSubject weatherSubject=new ConcreteWeatherSubject();
		
		//2.创建观察者
		ConcreteObserver observerGirl=new ConcreteObserver();
		observerGirl.setObserverName("黄明的女朋友");
		observerGirl.setRemindThing("是我们的第一次约会，地点街心公园，不见不散呦");
		
		ConcreteObserver observerMom=new ConcreteObserver();
		observerMom.setObserverName("老妈");
		observerMom.setRemindThing("是一个购物的好日子，明天去天虹扫货");
		
		//3.注册观察者
		weatherSubject.attach(observerGirl);
		weatherSubject.attach(observerMom);
		//4.目标发布天气
		weatherSubject.setWeatherContext("明天 天气晴朗，蓝天白云，气温28度");
	}
}
