package com.imooc.pattern.strategy;

public class Test {
	public static void main(String[] args) {
		Duck duck=new RedheadDuck();
		duck.display();
		duck.quack();
		duck.fly();
		
		Duck mallardDuck=new MallardDuck();
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.fly();
	}
}
