package org.algorithm.jsontest;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDetailBean implements Serializable {
	@JsonProperty(value = "ProUrl")
	@JSONField(name= "1")
    private String proUrl;
	
	@JsonProperty(value = "AvgVisitNum")
    @JSONField(name = "2")
    private Double avgVisitNum;

	@JsonProperty(value = "SkuId")
    @JSONField(name= "3")
    private String skuId;

	@JsonProperty(value = "ToCartRate")
    @JSONField(name= "4")
    private Double toCartRate;

    @JsonProperty(value = "DealProNum")
    @JSONField(name= "5")
    private String dealProNum;

    @JsonProperty(value = "DealRate")
    @JSONField(name= "6")
    private String dealRate;
    
    @JsonProperty(value = "AvgStayTime")
    @JSONField(name= "7")
    private String avgStayTime;

    @JsonProperty(value = "DealUser")
    @JSONField(name= "8")
    private String dealUser;
    
    @JsonProperty(value = "PV")
    @JSONField(name= "9")
    private Integer pV;

    @JsonProperty(value = "ImgUrl")
    @JSONField(name= "10")
    private String imgUrl;

    @JsonProperty(value = "DealNum")
    @JSONField(name= "11")
    private String dealNum;

	public String getProUrl() {
		return proUrl;
	}

	public void setProUrl(String proUrl) {
		this.proUrl = proUrl;
	}

	public Double getAvgVisitNum() {
		return avgVisitNum;
	}

	public void setAvgVisitNum(Double avgVisitNum) {
		this.avgVisitNum = avgVisitNum;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Double getToCartRate() {
		return toCartRate;
	}

	public void setToCartRate(Double toCartRate) {
		this.toCartRate = toCartRate;
	}

	public String getDealProNum() {
		return dealProNum;
	}

	public void setDealProNum(String dealProNum) {
		this.dealProNum = dealProNum;
	}

	public String getDealRate() {
		return dealRate;
	}

	public void setDealRate(String dealRate) {
		this.dealRate = dealRate;
	}

	public String getAvgStayTime() {
		return avgStayTime;
	}

	public void setAvgStayTime(String avgStayTime) {
		this.avgStayTime = avgStayTime;
	}

	public String getDealUser() {
		return dealUser;
	}

	public void setDealUser(String dealUser) {
		this.dealUser = dealUser;
	}

	public Integer getPV() {
		return pV;
	}

	public void setPV(Integer pV) {
		this.pV = pV;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDealNum() {
		return dealNum;
	}

	public void setDealNum(String dealNum) {
		this.dealNum = dealNum;
	}

}
