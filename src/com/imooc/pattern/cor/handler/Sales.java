package com.imooc.pattern.cor.handler;

public class Sales extends PriceHandler{

	@Override
	public void processDiscount(float discount) {
		if(discount<=0.5) {
			System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
		}else {
			System.out.println("销售人员无法处理");
			successor.processDiscount(discount);
		}
	}
}
