package com.javaee.features.cdi.scopes.session;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/scope")
public class SessionWebService {

	@Inject
	SessionScopedBean sessionScopedBean;

	@GET
	@Path("/session")
	@Produces("text/plain")
	public String sessionScope() {
		return this.toString() + "\n	" + sessionScopedBean.toString();
	}

}
