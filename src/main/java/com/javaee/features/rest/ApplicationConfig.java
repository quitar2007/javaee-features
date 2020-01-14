package com.javaee.features.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.javaee.features.cdi.injection.InjectionDemoWebService;
import com.javaee.features.cdi.lifecyclecallbacks.LifecycleDemoWebService;
import com.javaee.features.cdi.qualifiers.QualifierWebService;
import com.javaee.features.cdi.scopes.session.SessionWebService;
import com.javaee.features.cdi.scopes.application.ApplicationWebService;
import com.javaee.features.cdi.scopes.dependent.DependentWebService;
import com.javaee.features.cdi.scopes.request.RequestWebService;

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
		webResources.add(InjectionDemoWebService.class);
		webResources.add(LifecycleDemoWebService.class);
		// scope demo services
		webResources.add(ApplicationWebService.class);
		webResources.add(DependentWebService.class);
		webResources.add(RequestWebService.class);
		webResources.add(SessionWebService.class);

		// Qualifier
		webResources.add(QualifierWebService.class);
		return webResources;
	}
}
