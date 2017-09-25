package com.imooc.pattern.strategy;

public class FlyNoWay implements FlyStragety {

	@Override
	public void performFly() {
		System.out.println("我不能飞");
	}
}
