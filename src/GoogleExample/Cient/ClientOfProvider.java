package GoogleExample.Cient;

import service.ServiceInstanceOfProvider;
import service.ServiceOfInstanceBinding;
import GoogleExample.MyModules.MyModuleOfProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientOfProvider {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new MyModuleOfProvider());
		ServiceInstanceOfProvider service = injector
				.getInstance(ServiceInstanceOfProvider.class);
		service.getLog().printInfo();
	
	}
}
