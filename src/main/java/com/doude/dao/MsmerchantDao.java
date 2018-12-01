package com.doude.dao;

import java.util.List;

import com.doude.enity.Msmerchant;
import com.doude.vo.msmerchant.MsmerchantVo;
import org.springframework.stereotype.Repository;

@Repository
public interface MsmerchantDao {
	public void insertMsmerchant(Msmerchant msmerchant);
	public Msmerchant queryMsmerchantByid(int id);
	public void updateMsmerchant(Msmerchant msmerchant);
	public void deleteMsmerchantbyid(int id);
	public List<Msmerchant> queryMsmerchantbyvo(MsmerchantVo msmerchantVo);
 }
