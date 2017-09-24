package com.imooc.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.imooc.pattern.proxy.Car;
import com.imooc.pattern.proxy.Moveable;

public class Test{
	public static void main(String[] args) {
		Moveable car=new Car();
		InvocationHandler h=new TimeHandler(car);
		Class<?> cls=car.getClass();
		Moveable m=(Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);
		
		InvocationHandler l=new LogHandler(m);
		Class<?> clsm=m.getClass();
		Moveable m2=(Moveable) Proxy.newProxyInstance(clsm.getClassLoader(),clsm.getInterfaces(),l);
		m2.move();
	}
}
