package com.javaee.features.cdi.scopes.session;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class SessionScopedBean implements Serializable {

	public SessionScopedBean() {
	}

}
