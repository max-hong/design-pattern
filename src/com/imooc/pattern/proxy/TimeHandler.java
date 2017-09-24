package com.imooc.pattern.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{

	private Object target;
	
	public TimeHandler( Object target) {
		this.target=target;
	}
	
	@Override
	public void invoke(Object o, Method m) {
		try {
			System.out.println("汽车开始行使");
			m.invoke(target);
			System.out.println("汽车结束行使");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
