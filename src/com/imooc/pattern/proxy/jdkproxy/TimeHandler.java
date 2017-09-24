package com.imooc.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	/**
	 * 参数：
	 *  proxy 被代理的对象 
	 *  method 被代理的方法 
	 *  args 方法的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使....");
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行使结束....汽车行使时间:" + (endTime - startTime) + "毫秒");
		return null;
	}
	
	public void sayHello() {
		System.out.println("hello world");
	}

}
