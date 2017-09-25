package com.imooc.pattern.cor.handler;

public class PriceHandlerFactory {

	/**
	 * 创建PriceHandler工厂方法
	 * 
	 * @return
	 */
	public static PriceHandler createPriceHandler() {
		PriceHandler sales = new Sales();
		PriceHandler manager = new Manager();
		PriceHandler ceo = new CEO();
		sales.setPriceHandler(manager);
		manager.setPriceHandler(ceo);
		ceo.setPriceHandler(sales);
		return sales;
	}

}
