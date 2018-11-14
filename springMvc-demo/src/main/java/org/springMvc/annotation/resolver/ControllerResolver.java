package org.springMvc.annotation.resolver;

import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springMvc.annotation.SelfController;
import org.springMvc.model.handler.BeanMapping;

public class ControllerResolver implements IResolver{
	
	
	public void process(String classPath,BeanMapping beanMapping) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Set<String> set = new HashSet<String>();
		this.listClass(classPath, set);
		getAnnotationClassByParam(set,beanMapping);
	}
	
	private void listClass(String classPath,Set<String> result){
		if(classPath==null || "".equals(classPath)){
			return;
		}
		
		File file = new File(System.getProperty("user.dir")+"/target/classes/"+classPath.replace(".", System.getProperty("file.separator")));
		if(file.isDirectory()){
			
			File[] files = file.listFiles();
			for(File tempFile:files){
				if(tempFile.isFile() && tempFile.getAbsolutePath().endsWith(".class")){
					result.add(classPath+"."+tempFile.getName().replace(".class", ""));
				}else if(tempFile.isDirectory()){
					listClass(classPath+"."+tempFile.getName(),result);
				}
			}
		}else if(file.isFile()  && file.getAbsolutePath().endsWith(".class")){
			result.add(classPath+"."+file.getName().replace(".class", ""));
			
		}
	}
	private void getAnnotationClassByParam(Set<String> set,BeanMapping beanMapping) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		if(set.size()>0){
			for(String className:set){
				Class clasz = Class.forName(className);
				if(clasz.isAnnotationPresent(this.getResolverType())){
					beanMapping.put(className, clasz.newInstance());
				}
			}
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.class.path"));
		ControllerResolver cr = new ControllerResolver();
		BeanMapping beanMapping = new BeanMapping();
		cr.process("org.springMvc",beanMapping);
		Set<Map.Entry<String, Object>> es = beanMapping.entrySet();
		for(Map.Entry<String, Object> entry:es){
			System.out.println(entry.getKey()+","+entry.getValue().getClass().getName());
		}
	}

	@Override
	public Class getResolverType() {
		
		return SelfController.class;
	}
}
