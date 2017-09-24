package com.imooc.pattern.abstractfactory;
/**
 * 圣诞系列加工厂
 * @author honghao
 *
 */
public class HNFactory implements PersonFactory{

	@Override
	public HNBoy getBoy() {
		return new HNBoy();
	}

	@Override
	public HNGirl getGirl() {
		return new HNGirl();
	}

}
