package com.imooc.pattern.adapter;

/**
 * 使用继承方式实现二相转三相的插座适配器
 * 
 * @author honghao
 *
 */
public class TwoPlugIfAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() {
		System.out.println("使用继承方式实现二相转三相");
		this.powerWithTwo();
	}

}
