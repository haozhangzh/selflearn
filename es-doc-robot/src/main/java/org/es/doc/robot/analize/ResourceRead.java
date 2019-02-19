package org.es.doc.robot.analize;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.lang3.StringUtils;

public class ResourceRead {

	public InputStream getInputStream(String filePath) throws Exception{
		if(StringUtils.isBlank(filePath)){
			throw new Exception("filePath is null");
		}
		InputStream input = new FileInputStream(filePath);
		return input;
	}
	
	public InputStream getInputStream(File file) throws Exception{
		if(file == null){
			throw new Exception("file is null");
		}
		InputStream input = new FileInputStream(file);
		return input;
	}
	
}
