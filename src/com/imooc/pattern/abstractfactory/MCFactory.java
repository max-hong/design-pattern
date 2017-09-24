package com.imooc.pattern.abstractfactory;
/**
 * 圣诞系列加工厂
 * @author honghao
 *
 */
public class MCFactory implements PersonFactory{

	@Override
	public Boy getBoy() {
		return new MCBoy();
	}

	@Override
	public Girl getGirl() {
		return new MCGirl();
	}

}
