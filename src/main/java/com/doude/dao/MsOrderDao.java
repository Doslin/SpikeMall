package com.doude.dao;

import java.util.List;

import com.doude.enity.Msorder;
import com.doude.vo.order.MsorderVo;
import org.springframework.stereotype.Repository;

@Repository
public interface MsOrderDao {
	public void insertMsOrder(Msorder msorder);
	public List<Msorder> queryorderbyuserid(int userid);
	public void updateorderpaystatusbyid(MsorderVo msorderVo);
	public List<Msorder> queryorderbymerchantid(int merchantid);
}
