package org.xstream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xstream.demo.bean.Person;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class Test {

	public static void main(String[] args) {
		Person bean = new Person("张三",19);
		XStream xstream = new XStream();
		long start = System.currentTimeMillis();
		String xml = xstream.toXML(bean);
		long end = System.currentTimeMillis() - start;
		System.out.println(xml);
		System.out.println("转XML耗时："+end);
		
		start = System.currentTimeMillis();
        bean = (Person) xstream.fromXML(xml);
        end = System.currentTimeMillis() - start;
        System.out.println(bean);
        System.out.println("转BEAN耗时："+end);
        
        xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.setMode(XStream.NO_REFERENCES);
        
        //Json序列化
        start = System.currentTimeMillis();
        String json=xstream.toXML(bean);
        end = System.currentTimeMillis() - start;
        System.out.println(json);
        System.out.println("转JSON耗时："+end);
        //Json反序列
        start = System.currentTimeMillis();
        bean=(Person)xstream.fromXML(json);
        System.out.println(bean);
        end = System.currentTimeMillis() - start;
        System.out.println("JSON转BEAN耗时："+end);
       
        Map<String,String> map = new HashMap<String,String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        xstream = new XStream();
        xml = xstream.toXML(map);
        System.out.println(xml);
        map = (Map<String,String>) xstream.fromXML(xml);
        System.out.println(map);
        
        List<String> list = new ArrayList<String>();
        list.add("l1");
        list.add("l2");
        list.add("l3");
        xml = xstream.toXML(list);
        System.out.println(xml);
        list = (List<String>) xstream.fromXML(xml);
        System.out.println(list);
	}

}
