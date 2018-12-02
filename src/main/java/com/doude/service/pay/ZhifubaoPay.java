package com.doude.service.pay;

import org.springframework.stereotype.Service;

@Service
public class ZhifubaoPay implements Ordertopay{

	public int paywithorder(String tradeserialnumber, int payamount) {
		System.out.println("֧����֧���ɹ�");
		return 1;
	}

	public int refundwithorder(String tradeserialnumber, int payamount) {
		System.out.println("֧�����˿�ɹ�");
		return 1;
	}

}
