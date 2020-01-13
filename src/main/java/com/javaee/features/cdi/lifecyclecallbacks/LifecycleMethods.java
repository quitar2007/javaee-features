package com.javaee.features.cdi.lifecyclecallbacks;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

/**
 * Illustrates the annotations marking the lifecycle methods.
 */
@ApplicationScoped
public class LifecycleMethods {

	public LifecycleMethods() {
		System.out.println("Constructor is called...");
	}

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct is called...");
	}

	@PreDestroy
	public void dispose() {
		System.out.println("@PreDestroy is called...");
	}
}
