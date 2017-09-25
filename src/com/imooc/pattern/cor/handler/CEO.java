package com.imooc.pattern.cor.handler;

public class CEO extends PriceHandler{

	@Override
	public void processDiscount(float discount) {
		if(discount<=0.9) {
			System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
		}else {
			System.out.println("CEO无法接受");
			System.out.format("%s拒绝了折扣：%.2f%n",this.getClass().getName(),discount);
		}
	}

}
