package com.doude.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doude.dao.MsproductdetailDao;
import com.doude.enity.Msproductdetail;

@Service
public class MsproductDetailService {
	
	@Autowired
	MsproductdetailDao msproductdetailDao;
	
	public void insertMsproductdetail(Msproductdetail msproductdetail){
		msproductdetailDao.insertMsproductdetail(msproductdetail);
	}
	public Msproductdetail queryMsproductdetailByid(int productid){
		return msproductdetailDao.queryMsproductdetailByid(productid);
	}
	public void updateMsproductdetail(Msproductdetail msproductdetail){
		msproductdetailDao.updateMsproductdetail(msproductdetail);
	}
	
}
