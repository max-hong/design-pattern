package com.imooc.pattern.template;

/**
 * 抽象基类，为所有子类提供一个算法框架
 * 
 * 提神饮料
 * 
 * @author honghao
 *
 */
public abstract class RefreshBeverage {

	public final void prepareBeverageTemplate() {
		step1();
		step2();
		step3();
		if (isNeedStep4()) {
			step4();
		}
	}

	protected boolean isNeedStep4() {
		return true;
	}

	private void step1() {
		System.out.println("step1");
	}

	protected abstract void step2();

	private void step3() {
		System.out.println("step3");
	}

	private void step4() {
		System.out.println("step4");
	}
}
