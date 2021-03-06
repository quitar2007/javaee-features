package com.javaee.features.ejb;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 * Created by claudiu.barac on 10/14/2020.
 */
@Stateful
public class StatefulBean implements BeanContract {

	private static AtomicInteger instanceIDGenerator = new AtomicInteger();
	private int instanceID;

	@PostConstruct
	public void init() {
		instanceID = instanceIDGenerator.incrementAndGet();
	}

	public int getInstanceID() {
		return instanceID;
	}

	public String execute() {
		return "StatefulBean[" + instanceID + "]";
	}

	public void throwError() {
		throw new RuntimeException("Asta la vista " + instanceID);
	}
}
