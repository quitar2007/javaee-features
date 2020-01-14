package com.javaee.features.cdi.scopes.request;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.javaee.features.cdi.scopes.dependent.DependentScopedBean;
import com.javaee.features.cdi.scopes.dependent.RequestScopedWithDependentScopedField;
import com.javaee.features.cdi.scopes.session.SessionScopedBean;

@Path("/scope")
@ApplicationScoped
public class RequestWebService {

	@Inject
	RequestScopedBean requestScopedBean;

	@GET
	@Path("/request")
	@Produces("text/plain")
	public String requestScope() {
		return this.toString()
				+ "\n	" + requestScopedBean.toString();
	}
}
