package com.doude.enity;

import java.util.Date;

/**
 * 订单
 * @author Administrator
 *
 */
public class Msorder {
	private int id;//
	private int productid;//商品id
	private int payamount;//支付金额
	private int userid;//用户id
	private int merchantid;//商家id
	private Date createtime;//订单创建时间
	private Date paytime;//订单支付时间
	private int paystatus;//支付状态  1. 未支付  2. 已支付  3. 退款成功 4. 用户发起退款申请
	private String receivingadress;//收货地址
	private String receivingname;//收获人姓名
	private String receivingphone;//收货人联系方式
	private String tradeserialnumber;//流水号
	private int num;//
	private int paytype;//1����֧����  2����΢��  3��������
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getPayamount() {
		return payamount;
	}
	public void setPayamount(int payamount) {
		this.payamount = payamount;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getMerchantid() {
		return merchantid;
	}
	public void setMerchantid(int merchantid) {
		this.merchantid = merchantid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getPaytime() {
		return paytime;
	}
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	public int getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(int paystatus) {
		this.paystatus = paystatus;
	}
	public String getReceivingadress() {
		return receivingadress;
	}
	public void setReceivingadress(String receivingadress) {
		this.receivingadress = receivingadress;
	}
	public String getReceivingname() {
		return receivingname;
	}
	public void setReceivingname(String receivingname) {
		this.receivingname = receivingname;
	}
	public String getReceivingphone() {
		return receivingphone;
	}
	public void setReceivingphone(String receivingphone) {
		this.receivingphone = receivingphone;
	}
	public String getTradeserialnumber() {
		return tradeserialnumber;
	}
	public void setTradeserialnumber(String tradeserialnumber) {
		this.tradeserialnumber = tradeserialnumber;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPaytype() {
		return paytype;
	}
	public void setPaytype(int paytype) {
		this.paytype = paytype;
	}
	
	
	
	
}
