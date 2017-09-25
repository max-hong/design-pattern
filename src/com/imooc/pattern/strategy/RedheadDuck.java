package com.imooc.pattern.strategy;

/**
 * 红头鸭子
 * 
 * @author honghao
 *
 */
public class RedheadDuck extends Duck {

	public RedheadDuck() {
		super.setFlyStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("红头鸭子");
	}
}
