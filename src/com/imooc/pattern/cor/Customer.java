package com.imooc.pattern.cor;

import com.imooc.pattern.cor.handler.PriceHandler;
import com.imooc.pattern.cor.handler.PriceHandlerFactory;

/**
 * 客户，请求折扣
 * 
 * @author honghao
 *
 */
public class Customer {

	private PriceHandler priceHandler;

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount) {
		priceHandler.processDiscount(discount);
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
		customer.requestDiscount(1f);
	}
}
