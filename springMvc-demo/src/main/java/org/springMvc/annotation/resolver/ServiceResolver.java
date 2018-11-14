package org.springMvc.annotation.resolver;

import org.springMvc.annotation.SelfService;

public class ServiceResolver implements IResolver {

	@Override
	public Class getResolverType() {
		return SelfService.class;
	}

}
