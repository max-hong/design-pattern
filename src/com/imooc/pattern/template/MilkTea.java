package com.imooc.pattern.template;

public class MilkTea extends RefreshBeverage {

	@Override
	protected void step2() {
		System.out.println("MilkTea step2...");
	}

	@Override
	protected boolean isNeedStep4() {
		return false;
	}
}
