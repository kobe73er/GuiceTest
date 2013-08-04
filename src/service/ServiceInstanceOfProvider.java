package service;

import com.google.inject.Inject;

import GoogleExample.provider.Log;

public class ServiceInstanceOfProvider {
	@Inject
	Log log;

	public Log getLog() {
		return log;
	}

	public void printInfo() {
		log.printInfo();
	}

}
