package com.javaee.features.cdi.scopes.dependent;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class RequestScopeBean {

	@Inject
	DependentScopeBean dependentScopeBean;

	public DependentScopeBean getDependentScopeBean() {
		return dependentScopeBean;
	}
}
