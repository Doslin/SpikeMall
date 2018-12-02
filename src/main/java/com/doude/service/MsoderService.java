package com.doude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doude.dao.MsOrderDao;
import com.doude.enity.Msorder;
import com.doude.vo.order.ConstomOrder;
import com.doude.vo.order.MsorderVo;

@Service
public class MsoderService {
	
	@Autowired
	MsOrderDao msOrderDao;
	
	public void insertMsOrder(Msorder msorder){
		msOrderDao.insertMsOrder(msorder);
	}
	
	public List<Msorder> queryorderbyuserid(int userid){
		return msOrderDao.queryorderbyuserid(userid);
	}
	
	public List<Msorder> queryorderbymerchantid(int merchantid){
		return msOrderDao.queryorderbymerchantid(merchantid);
	}
	
	public void updateorderpaystatusbyid(int paystatus,int id,int paytype){
		MsorderVo msorderVo = new MsorderVo();
		ConstomOrder constomOrder = new ConstomOrder();
		constomOrder.setPaystatus(paystatus);
		constomOrder.setId(id);
		constomOrder.setPaytype(paytype);
		msorderVo.setConstomOrder(constomOrder);
		msOrderDao.updateorderpaystatusbyid(msorderVo);
	}
}
