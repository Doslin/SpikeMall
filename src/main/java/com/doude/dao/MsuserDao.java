package com.doude.dao;

import java.util.List;

import com.doude.enity.Msmerchant;
import com.doude.enity.Msuser;
import com.doude.vo.msmerchant.MsmerchantVo;
import com.doude.vo.msuser.MsuserVo;

public interface MsuserDao {
	public void insertUser(Msuser msuser);
	public Msuser queryMsuserByid(int id);
	public void updateMsuser(Msuser msuser);
	public void deleteMsuserbyid(int id);
	public List<Msuser> queryMsuserbyvo(MsuserVo msuserVo);
 }
