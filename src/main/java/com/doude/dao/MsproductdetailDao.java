package com.doude.dao;

import java.util.List;

import com.doude.enity.Msproductdetail;
import com.doude.enity.Msproductinfo;
import com.doude.vo.msproductinfo.MsProductVo;
import org.springframework.stereotype.Repository;

@Repository
public interface MsproductdetailDao {
	public void insertMsproductdetail(Msproductdetail msproductdetail);
	public Msproductdetail queryMsproductdetailByid(int productid);
	public void updateMsproductdetail(Msproductdetail msproductdetail);
}
