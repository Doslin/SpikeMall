package com.doude.enity;

import java.util.Date;

/**
 *
 * @author Administrator
 *
 */
public class Msproductinfo {
	private int id;//
	private int productid;//商品id
	private String producttitle;//商品标题
	private String productpicture;//商品图片
	private int miaoshaprice;//商品价格
	private int originalprice;//商品原价
	private int msmerchantid;//商家id
	private Date applydate;//申请时间
	private Date auditdate;//审核时间
	private int auditstate;//审核状态
	private Date starttime;//秒杀开始时间
	private Date endtime;//秒杀结束时间
	private String starttimestring;//开始时间string
	private String endtimestring;//结束时间String
	private int productcount;//秒杀商品数量
	private int stockcount;//库存
	private String description;//描述
	
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
	public String getProducttitle() {
		return producttitle;
	}
	public void setProducttitle(String producttitle) {
		this.producttitle = producttitle;
	}
	public String getProductpicture() {
		return productpicture;
	}
	public void setProductpicture(String productpicture) {
		this.productpicture = productpicture;
	}
	public int getMiaoshaprice() {
		return miaoshaprice;
	}
	public void setMiaoshaprice(int miaoshaprice) {
		this.miaoshaprice = miaoshaprice;
	}
	public int getOriginalprice() {
		return originalprice;
	}
	public void setOriginalprice(int originalprice) {
		this.originalprice = originalprice;
	}
	public int getMsmerchantid() {
		return msmerchantid;
	}
	public void setMsmerchantid(int msmerchantid) {
		this.msmerchantid = msmerchantid;
	}
	public Date getApplydate() {
		return applydate;
	}
	public void setApplydate(Date applydate) {
		this.applydate = applydate;
	}
	public Date getAuditdate() {
		return auditdate;
	}
	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}
	public int getAuditstate() {
		return auditstate;
	}
	public void setAuditstate(int auditstate) {
		this.auditstate = auditstate;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getStarttimestring() {
		return starttimestring;
	}
	public void setStarttimestring(String starttimestring) {
		this.starttimestring = starttimestring;
	}
	public String getEndtimestring() {
		return endtimestring;
	}
	public void setEndtimestring(String endtimestring) {
		this.endtimestring = endtimestring;
	}
	public int getProductcount() {
		return productcount;
	}
	public void setProductcount(int productcount) {
		this.productcount = productcount;
	}
	public int getStockcount() {
		return stockcount;
	}
	public void setStockcount(int stockcount) {
		this.stockcount = stockcount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Msproductinfo [id=" + id + ", productid=" + productid + ", producttitle=" + producttitle
				+ ", productpicture=" + productpicture + ", miaoshaprice=" + miaoshaprice + ", originalprice="
				+ originalprice + ", msmerchantid=" + msmerchantid + ", applydate=" + applydate + ", auditdate="
				+ auditdate + ", auditstate=" + auditstate + ", starttime=" + starttime + ", endtime=" + endtime
				+ ", starttimestring=" + starttimestring + ", endtimestring=" + endtimestring + ", productcount="
				+ productcount + ", stockcount=" + stockcount + ", description=" + description + "]";
	}
	
	
	
}
