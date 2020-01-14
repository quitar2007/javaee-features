package com.javaee.features.cdi.scopes.dependent;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/scope")
@ApplicationScoped
public class DependentWebService {

	@Inject
	DependentScopedBean dependentScopedBean;

	@Inject
	RequestScopedWithDependentScopedField requestWithInnerDependentScopeBean;

	@GET
	@Path("/dependent-in-application")
	@Produces("text/plain")
	public String dependentInApplication() {
		return this.toString()
				+ "\n	" + dependentScopedBean.toString();
	}

	@GET
	@Path("/dependent-in-request")
	@Produces("text/plain")
	public String dependentInRequest() {
		return this.toString()
				+ "\n" + requestWithInnerDependentScopeBean.toString()
				+ "\n	" + requestWithInnerDependentScopeBean.getDependentScopedBean().toString();
	}

}
