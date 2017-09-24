package com.imooc.pattern.proxy;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args)
			throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class, h);
		m.move();
	}
}
