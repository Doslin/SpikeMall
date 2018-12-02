package com.doude.service.pay;

/**
 *
 * @author Administrator
 *
 */
public interface Ordertopay {
	
	/**
	 * 
	 * @param tradeserialnumber
	 * @param payamount
	 * @return 1 支付成功 2支付失败
	 */
	public int paywithorder(String tradeserialnumber, int payamount);
	
	/**
	 * 退款
	 * @param tradeserialnumber
	 * @param payamount
	 * @return 1 退款成功 2退款失败
	 */
	public int refundwithorder(String tradeserialnumber, int payamount);
}
