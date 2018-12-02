package com.doude.dao;

import java.util.List;

import com.doude.enity.Msproductinfo;
import com.doude.vo.msproductinfo.MsProductVo;
import org.springframework.stereotype.Repository;

@Repository
public interface MsproductDao {
	public void applymsproduct(Msproductinfo msproductinfo);
	public List<Msproductinfo> listmsproduct(MsProductVo msProductVo);
	public Msproductinfo querymsproductByid(int id);
	public void deletemsproductByid(int id);
	public void updatemsproduct(Msproductinfo msproductinfo);
	public void updatemsproductstate(MsProductVo msProductVo);
}
