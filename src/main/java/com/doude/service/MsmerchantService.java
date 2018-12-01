package com.doude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doude.dao.MsmerchantDao;
import com.doude.enity.Msmerchant;
import com.doude.vo.msmerchant.MsmerchantVo;

@Service
public class MsmerchantService {
	
	@Autowired
	MsmerchantDao msmerchantDao ;
	
	
	public void insertMsmerchant(Msmerchant msmerchant){
		msmerchantDao.insertMsmerchant(msmerchant);
	};
	public Msmerchant queryMsmerchantByid(int id){
		return msmerchantDao.queryMsmerchantByid(id);
	}
	public void updateMsmerchant(Msmerchant msmerchant){
		msmerchantDao.updateMsmerchant(msmerchant);
	};
	public void deleteMsmerchantbyid(int id){
		msmerchantDao.deleteMsmerchantbyid(id);
	};
	
	public List<Msmerchant> queryMsmerchantbyvo(MsmerchantVo msmerchantVo){
		return msmerchantDao.queryMsmerchantbyvo(msmerchantVo);
	}
}
