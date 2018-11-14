package org.springMvc.annotation.resolver;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractResolver implements IResolver {

	private Set<String> resolvedClassSet = new HashSet<String>();
	public abstract void resolve();

}
