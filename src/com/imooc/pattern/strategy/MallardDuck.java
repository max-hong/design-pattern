package com.imooc.pattern.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		super.setFlyStragety(new FlyNoWay());
	}
	
	@Override
	public void quack() {
		System.out.println("呀呀呀");
	}
	
	@Override
	public void display() {
		System.out.println("绿脖鸭子");
	}

}
