package com.imooc.pattern.adapter;

/**
 * 二相转三相的插座适配器
 * 
 * @author honghao
 *
 */
public class TwoPlugIfAdapter implements ThreePlugIf {

	private GBTwoPlug plug;

	public TwoPlugIfAdapter(GBTwoPlug plug) {
		this.plug=plug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("使用组合方式实现二相转三相");
		plug.powerWithTwo();
	}

}
