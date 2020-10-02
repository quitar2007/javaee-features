package com.javaee.features.ejb;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 * Created by claudiu.barac on 9/23/2020.
 */
@Stateless
public class Worker {

	private static AtomicInteger instanceIDGenerator = new AtomicInteger();
	private int instanceID;

	@PostConstruct
	public void init() {
		instanceID = instanceIDGenerator.incrementAndGet();
	}

	public String execute() {
		return "Worker[" + instanceID + "]";
	}
}
