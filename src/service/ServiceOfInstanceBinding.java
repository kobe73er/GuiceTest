package service;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ServiceOfInstanceBinding {
	@Inject
	@Named("JDBC URL")
	private String JDBC;

	@Inject
	@Named("login timeout seconds")
	private int times;

	public int getTimes() {
		return times;
	}

	public String getJDBC() {
		return JDBC;
	}

}
