package com.javaee.features.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/welcome")
public class WebService {

	@GET
	@Produces("text/plain")
	public String welcome() {
		return "Sper sa mearga";
	}
}
