package com.imooc.pattern.cor.handler;

public class Manager extends PriceHandler{

	@Override
	public void processDiscount(float discount) {
		if(discount>0.5 && discount<=0.7) {
			System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
		}else {
			System.out.println("经理无法处理");
			successor.processDiscount(discount);
		}
	}

}
