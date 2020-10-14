package com.javaee.features.ejb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ejb")
@RequestScoped
public class EjbWebService {

	@Inject
	private StatelessBean statelessBean;

	@Inject
	private StatefulBean statefulBean;

	@GET
	@Produces("text/plain")
	@Path("/stateless")
	public String executeStateless() {
		return statelessBean.execute();
	}

	@GET
	@Produces("text/plain")
	@Path("/stateful")
	public String executeStateful() {
		return statelessBean.execute();
	}

	@GET
	@Produces("text/plain")
	@Path("/corrupt-stateless")
	public void corruptStateless() {
		statelessBean.throwError();
	}

	@GET
	@Produces("text/plain")
	@Path("/corrupt-stateful")
	public void corruptStateful() {
		statefulBean.throwError();
	}
}
