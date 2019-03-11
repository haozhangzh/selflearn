package org.es.doc.robot.switcase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SwitchTest {

	public static void main(String[] args) throws IOException {
		SwitchTest.switchTestCase("name2");
		String path = "/Users/user/Documents/git-proj/dev_3.4.0_webms_new_181204/jmapi_servitization_webms/pom.xml";
		System.out.println(SwitchTest.readFirstLineFromFile(path));
	}
	
	public  static  void switchTestCase(String name){
		switch(name){
		  case "name1":
			  System.out.println("name1");
		  case "name2":
			  System.out.println("name2");
		  case "name3":
			  System.out.println("name3");
		  default:
			  System.out.println("default");
		}
	}
	static String readFirstLineFromFile(String path) throws IOException {  

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {  
            return br.readLine();  
        }  
    } 

}
