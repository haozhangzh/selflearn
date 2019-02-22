package org.java.language.specification.demo.interf.defmethod;

public interface Defaultable {
  
	default String notRequired(){
		return "Default implementation";
	}
}
