package com.imooc.pattern.abstractfactory;

public class TestDemo {
	public static void main(String[] args) {
		PersonFactory personFactory=new MCFactory();
		
		Boy boy=personFactory.getBoy();
		boy.drawMan();
		
		Girl girl=personFactory.getGirl();
		girl.drawWoman();
		
		PersonFactory personFactory2=new HNFactory();
		personFactory2.getBoy().drawMan();
		personFactory2.getGirl().drawWoman();
	}
}
