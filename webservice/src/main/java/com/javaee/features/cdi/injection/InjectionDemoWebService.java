package com.javaee.features.cdi.injection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/injection")
@ApplicationScoped
public class InjectionDemoWebService {

	@Inject
	ConstructorInjection constructorInjection;

	@Inject
	SetterInjection setterInjection;

	@GET
	@Path("/constructor")
	@Produces("text/plain")
	public String constructorInjection() {
		return constructorInjection.getImageFileEditor().toString();
	}

	@GET
	@Path("/setter")
	@Produces("text/plain")
	public String setterInjection() {
		return setterInjection.getImageFileEditor().toString();
	}
}
