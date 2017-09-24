package com.imooc.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

	private Object target;

	public LogHandler(Object target) {
		super();
		this.target = target;
	}

	/**
	 * 参数： proxy 被代理的对象 method 被代理的方法 args 方法的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("日志开始....");
		method.invoke(target);
		System.out.println("日志结束....");
		return null;
	}

}