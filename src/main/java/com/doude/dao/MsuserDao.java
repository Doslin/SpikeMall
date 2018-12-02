package com.doude.dao;

import java.util.List;

import com.doude.enity.Msmerchant;
import com.doude.enity.Msuser;
import com.doude.vo.msmerchant.MsmerchantVo;
import com.doude.vo.msuser.MsuserVo;
import org.springframework.stereotype.Repository;

@Repository
public interface MsuserDao {
	public void insertUser(Msuser msuser);
	public Msuser queryMsuserByid(int id);
	public void updateMsuser(Msuser msuser);
	public void deleteMsuserbyid(int id);
	public List<Msuser> queryMsuserbyvo(MsuserVo msuserVo);
	public Msuser queryMsuserByuseraccount(String useraccount);
 }
