package com.javaee.features.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * This java class declares root resource and provider classes
 */
//Defines the base URI for all resource URIs.
@ApplicationPath("javaee")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		HashSet webResources = new HashSet<Class<?>>();
		webResources.add( WebService.class );
		return webResources;
	}
}
