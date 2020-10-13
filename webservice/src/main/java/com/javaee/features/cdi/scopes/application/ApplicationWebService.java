package com.javaee.features.cdi.scopes.application;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/scope")
public class ApplicationWebService {

	@Inject
	ApplicationScopedBean applicationScopedBean;

	@Inject
	RequestScopedWithApplicationScopedField requestScopedWithApplicationScopedField;

	@GET
	@Path("/application")
	@Produces("text/plain")
	public String applicationScope() {
		return applicationScopedBean.toString()
				+ "\n" + requestScopedWithApplicationScopedField.toString()
				+ "\n" + requestScopedWithApplicationScopedField.getApplicationScopedBean().toString();
	}
}
