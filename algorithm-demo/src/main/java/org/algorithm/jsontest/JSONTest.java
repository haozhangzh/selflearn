package org.algorithm.jsontest;

import java.io.IOException;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException{
		String jsonStr = "[{\"ProUrl\":\"item.jd.com/4004813.html\",\"AvgVisitNum\":2.682654768544339,\"SkuId\":\"4004813\",\"ToCartRate\":0.07752370329057445,\"DealProNum\":70.0,\"DealRate\":0.019520356943669825,\"AvgStayTime\":162.2601784718349,\"DealUser\":70,\"PV\":9620.0,\"ImgUrl\":\"//img10.360buyimg.com/n3/jfs/t28912/233/462221231/95086/b1b48e07/5bf4f925N7a6cd4a3.jpg\",\"DealNum\":70},{\"ProUrl\":\"item.jd.com/100000203804.html\",\"AvgVisitNum\":2.9468941100740262,\"SkuId\":\"100000203804\",\"ToCartRate\":0.09913099452848406,\"DealProNum\":76.0,\"DealRate\":0.02156420984872868,\"AvgStayTime\":162.5339555841648,\"DealUser\":67,\"PV\":9156.0,\"ImgUrl\":\"//img10.360buyimg.com/n3/jfs/t28951/193/474484702/150183/da84be7f/5bf4f9f7N2f2ec180.jpg\",\"DealNum\":67}]";
		System.out.println("原始串: "+jsonStr);
		ObjectMapper objectMapper = new ObjectMapper();
		List<ProductDetailBean> dev1 = objectMapper.readValue(jsonStr,new TypeReference<List<ProductDetailBean>>(){});
	    
		String afterShort = JSONObject.toJSONString(dev1);
	    System.out.println("afterShort: "+afterShort);
	    List<ProductDetailBean> dev2 = JSONArray.parseArray(afterShort,ProductDetailBean.class);
	    
	    System.out.println("还原成属性字段："+objectMapper.writeValueAsString(dev2));
	}
}
