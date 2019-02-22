package org.java.language.specification.demo.interf.defmethod;

public class DefaultableTest {

	public static void main(String[] args) {
//		Defaultable de = new DefaultableImpl();
//        System.out.println(de.notRequired());
//        Defaultable de2 = new OverridableImpl();
//        System.out.println(de2.notRequired());
		Defaultable de = DefaultableFactory.create(DefaultableImpl::new);
		System.out.println(de.notRequired());
		Defaultable de2 = DefaultableFactory.create(OverridableImpl::new);
		System.out.println(de2.notRequired());
	}

}
