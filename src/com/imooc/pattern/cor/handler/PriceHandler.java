package com.imooc.pattern.cor.handler;

/**
 * 价格处理人，负责处理客户折扣申请
 * 
 * @author honghao
 *
 */
public abstract class PriceHandler {

	/**
	 * 直接后继，用于传递请求
	 */
	protected PriceHandler successor;

	/**
	 * @param priceHandler
	 *            the priceHandler to set
	 */
	public void setPriceHandler(PriceHandler successor) {
		this.successor = successor;
	}

	/**
	 * 处理折扣请求
	 * 
	 * @param discount
	 */
	public abstract void processDiscount(float discount);

}
