package com.imooc.pattern.strategy;

public class FlyWithWin implements FlyStragety {

	@Override
	public void performFly() {
		System.out.println("振翅高飞");
	}
}
