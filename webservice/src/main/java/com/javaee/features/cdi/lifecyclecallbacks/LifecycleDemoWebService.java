package com.javaee.features.cdi.lifecyclecallbacks;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/lifecycle")
@ApplicationScoped
public class LifecycleDemoWebService {

	@Inject
	LifecycleMethods lifecycleMethods;

	@GET
	@Produces("text/plain")
	public String lifecycleMethodsDemo() {
		return lifecycleMethods.toString();
	}

}
