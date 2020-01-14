package com.javaee.features.cdi.scopes.dependent;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class RequestScopedWithDependentScopedField {

	@Inject
	DependentScopedBean dependentScopedBean;

	public DependentScopedBean getDependentScopedBean() {
		return dependentScopedBean;
	}
}
