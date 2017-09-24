package com.runoob.pattern.singleton;

public class Singleton {
	/** 1、懒汉式，线程不安全 **/
	private static Singleton instance1;
	/** 3、饿汉式 **/
	private static Singleton instance2 = new Singleton();

	private Singleton() {
	}

	/** 1、懒汉式，线程不安全 **/
	public static Singleton getInstance1() {
		if (instance1 == null) {
			return instance1 = new Singleton();
		}
		return instance1;
	}

	/** 2、懒汉式，线程安全 **/
	public static synchronized Singleton getInstance2() {
		if (instance2 == null) {
			instance2 = new Singleton();
		}
		return instance2;
	}
}
