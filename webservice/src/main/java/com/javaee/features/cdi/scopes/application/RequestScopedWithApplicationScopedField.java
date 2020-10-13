package com.javaee.features.cdi.scopes.application;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class RequestScopedWithApplicationScopedField {

	@Inject
	ApplicationScopedBean applicationScopedBean;

	public ApplicationScopedBean getApplicationScopedBean() {
		return applicationScopedBean;
	}
}
