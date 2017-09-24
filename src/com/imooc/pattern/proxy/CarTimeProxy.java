package com.imooc.pattern.proxy;

/**
 * 汽车行使时间代理
 * 
 * @author honghao
 *
 */
public class CarTimeProxy implements Moveable {
	private Moveable m;

	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使....");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行使结束....汽车行使时间:" + (endTime - startTime) + "毫秒");
	}

}
