package com.javaee.features.ejb;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;


/**
 * Created by claudiu.barac on 9/23/2020.
 */
@Stateless
public class ExecutionManager {

	private static AtomicInteger instanceIDGenerator = new AtomicInteger();
	private int instanceID;

	@Inject
	private Worker worker;

	@PostConstruct
	public void init() {
		instanceID = instanceIDGenerator.incrementAndGet();
	}

	public String execute() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.getClass());
		stringBuilder.append("[" + instanceID + "]");
		stringBuilder.append(" executed ");
		stringBuilder.append(worker.execute());

		System.out.println(stringBuilder);
		return stringBuilder.toString();
	}

	public String corruptInstance() {
		throw new RuntimeException();
	}
}
