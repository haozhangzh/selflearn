package org.algorithm.jsontest;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

public class ProductDetail implements Serializable {

	@JSONField(name= "1")
    private String ProUrl;
	
    @JSONField(name = "2")
    private Double AvgVisitNum;

    @JSONField(name= "3")
    private String SkuId;

    @JSONField(name= "4")
    private Double ToCartRate;

    @JSONField(name= "5")
    private String DealProNum;

    @JSONField(name= "6")
    private String DealRate;
    
    @JSONField(name= "7")
    private String AvgStayTime;

    @JSONField(name= "8")
    private String DealUser;

    @JSONField(name= "9")
    private Integer PV;

    @JSONField(name= "10")
    private String ImgUrl;

    @JSONField(name= "11")
    private String DealNum;

	public String getProUrl() {
		return ProUrl;
	}

	public void setProUrl(String proUrl) {
		ProUrl = proUrl;
	}

	public Double getAvgVisitNum() {
		return AvgVisitNum;
	}

	public void setAvgVisitNum(Double avgVisitNum) {
		AvgVisitNum = avgVisitNum;
	}

	public String getSkuId() {
		return SkuId;
	}

	public void setSkuId(String skuId) {
		SkuId = skuId;
	}

	public Double getToCartRate() {
		return ToCartRate;
	}

	public void setToCartRate(Double toCartRate) {
		ToCartRate = toCartRate;
	}

	public String getDealProNum() {
		return DealProNum;
	}

	public void setDealProNum(String dealProNum) {
		DealProNum = dealProNum;
	}

	public String getDealRate() {
		return DealRate;
	}

	public void setDealRate(String dealRate) {
		DealRate = dealRate;
	}

	public String getAvgStayTime() {
		return AvgStayTime;
	}

	public void setAvgStayTime(String avgStayTime) {
		AvgStayTime = avgStayTime;
	}

	public String getDealUser() {
		return DealUser;
	}

	public void setDealUser(String dealUser) {
		DealUser = dealUser;
	}

	public Integer getPV() {
		return PV;
	}

	public void setPV(Integer pV) {
		PV = pV;
	}

	public String getImgUrl() {
		return ImgUrl;
	}

	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}

	public String getDealNum() {
		return DealNum;
	}

	public void setDealNum(String dealNum) {
		DealNum = dealNum;
	}

}
