package com.javaee.features.cdi.qualifiers;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/qualifier")
public class QualifierWebService {

	@Inject
	Caine caine;

	@GET
	@Produces("text/plain")
	public String qualifier() {
		return caine.toString();
	}

}
