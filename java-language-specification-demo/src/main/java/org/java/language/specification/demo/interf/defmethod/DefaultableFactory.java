package org.java.language.specification.demo.interf.defmethod;

import java.util.function.Supplier;

public interface DefaultableFactory {

	static Defaultable create(Supplier<Defaultable> supplier){
		
		return supplier.get();
	}
}
