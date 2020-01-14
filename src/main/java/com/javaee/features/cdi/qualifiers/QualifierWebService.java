package com.javaee.features.cdi.qualifiers;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/qualifier")
public class QualifierWebService {

	@LatraTare
	@Inject
	Caine caine1;

	@LatraIncet
	@Inject
	Caine caine2;

	@GET
	@Produces("text/plain")
	public String qualifier() {
		return caine1.toString() + System.lineSeparator() + caine2.toString();
	}

}
