package com.javaee.features.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ejb")
@Stateless
public class EjbWebService {

	@Inject
	private ExecutionManager executionManager;

	@GET
	@Produces("text/plain")
	@Path("/execute")
	public String execute() {
		return executionManager.execute();
	}

	@GET
	@Produces("text/plain")
	@Path("/corrupt")
	public String executeCorruption() {
		return executionManager.corruptInstance();
	}
}
