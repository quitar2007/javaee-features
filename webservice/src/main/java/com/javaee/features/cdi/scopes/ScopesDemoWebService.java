package com.javaee.features.cdi.scopes;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.javaee.features.cdi.scopes.dependent.DependentScopeBean;
import com.javaee.features.cdi.scopes.dependent.RequestScopeBean;
import com.javaee.features.cdi.scopes.session.SessionScopeBean;


@Path("/scope")
@ApplicationScoped
public class ScopesDemoWebService {

	@Inject
	DependentScopeBean dependentScopeBean;

	@Inject
	RequestScopeBean requestWithInnerDependentScopeBean;

	@Inject
	RequestScopeBean requestScopeBean;

	@Inject
	SessionScopeBean sessionScopeBean;

	@GET
	@Path("/dependent-in-application")
	@Produces("text/plain")
	public String dependentInApplication() {
		return this.toString() + "\n	" + dependentScopeBean.toString();
	}

	@GET
	@Path("/dependent-in-request")
	@Produces("text/plain")
	public String dependentInRequest() {
		return this.toString()
				+ "\n" + requestWithInnerDependentScopeBean.toString()
				+ "\n	" + requestWithInnerDependentScopeBean.getDependentScopeBean().toString();
	}

	@GET
	@Path("/request")
	@Produces("text/plain")
	public String requestScope() {
		return this.toString()
				+ "\n	" + requestScopeBean.toString();
	}

	@GET
	@Path("/session")
	@Produces("text/plain")
	public String sessionScope() {
		return this.toString() + "\n	" + sessionScopeBean.toString();
	}

}
