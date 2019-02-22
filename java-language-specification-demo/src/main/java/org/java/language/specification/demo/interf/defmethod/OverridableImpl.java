package org.java.language.specification.demo.interf.defmethod;

public class OverridableImpl implements Defaultable {

	@Override
	public String notRequired(){
		return "Overridden impletion";
	}
}
